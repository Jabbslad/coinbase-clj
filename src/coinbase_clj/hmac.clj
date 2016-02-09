(ns coinbase-clj.hmac)

(defn now
	[] 
	(System/currentTimeMillis))

(defn format-method-name
	[method]
	(clojure.string/upper-case (name method)))

(defn signature
	[path body timestamp method]
	(str timestamp method path body))