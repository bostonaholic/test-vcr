(ns test-vcr.core
  (:require [clj-http.client :as http]))

(defn user-info [user]
  (http/get (str "https://api.github.com/users/" user)))
