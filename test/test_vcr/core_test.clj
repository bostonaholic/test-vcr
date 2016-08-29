(ns test-vcr.core-test
  (:require [clojure.test :refer :all]
            [test-vcr.core :refer :all]
            [vcr-clj.clj-http :refer [with-cassette]]))

(deftest user-info-test
  (testing "get user info"
    (testing "without cassette"
      (println "without cassette")
      (is (not (nil? (time (user-info "bostonaholic"))))))

    (testing "with cassette"
      (with-cassette ::bostonaholic-user-info
        (println "with cassette")
        (is (not (nil? (time (user-info "bostonaholic")))))))))
