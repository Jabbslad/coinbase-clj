(ns coinbase-clj.core
	(:require [clj-http.client :as client]))

(def base "https://api-public.sandbox.exchange.coinbase.com")
(def defaults {:throw-entire-message? true})

(defn format-url [endpoint]
	(str base "/" endpoint))

(defn make-request [method endpoint]
	(merge-with merge defaults {:url (format-url endpoint)
	  :method method}))

(defn api-call [method endpoint]
	(client/request (make-request method endpoint)))
