(ns cbe.compare
   (:use [clojure.test]))

; Equality
(is (= 1 1))
(is (= 1 1.0))
(is (= 1 (long 1) 1/1))
(is (not= 1 2))
(is (not= 1 1.01))
(is (= nil nil))

;Type dependent equality
(is (== 1 1))
;; TODO: show a falst example

; Not equals
(is (not= 1 2))
(is (not (= 1 2)))

; Less than operator
(is (< 2 3))
(is (not (< 3 2)))
(is (< 2))
(is (< 1 2 3))
(is (not (< 1 1 3)))

; Greater than operator
(is (> 3 2))
(is (not (> 2 3)))
(is (> 3))
(is (> 3 2 1))
(is (not (> 3 3 1)))

; Less than or equal to operator
(is (<= 2 3))
(is (<= 2 3 3))
(is (not (<= 2 3 2)))
(is (<= 2))

; Greater than or equal to operator
(is (>= 3 2))
(is (>= 3 3 2))
(is (not (>= 3 2 3)))
(is (>= 3))
