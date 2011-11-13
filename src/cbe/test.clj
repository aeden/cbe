(ns cbe.test
  (:use [clojure.test]))

;Truth
(is (= true (boolean 1)))
(is (= true true))
(is (not= true false))
(is (not= true nil))

;Nil?
(is (nil? nil))
(is (not (nil? 1)))
(is (not (nil? [])))

;Identical?
(is (identical? 1 1))
(is (identical? "a" "a"))
(is (not (identical? "a" "b")))

;Zero?
(is (zero? 0))
(is (not (zero? 1)))

;Positive?
(is (pos? 1))
(is (not (pos? -1)))
(is (not (pos? 0)))

;Negative?
(is (neg? -1))
(is (not (neg? 1)))
(is (not (neg? 0)))

;Even?
(is (even? 2))
(is (not (even? 3)))

;Odd?
(is (odd? 3))
(is (not (odd? 2)))
