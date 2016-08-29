(ns test-vcr.core-test
  (:require [clojure.test :refer :all]
            [test-vcr.core :refer :all]))

(deftest user-info-test
  (testing "get user info"
    (is (not (nil? (user-info "bostonaholic"))))))
