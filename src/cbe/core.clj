(ns cbe.core
   (:use [clojure.test]))

; Sum operator
(is (= 5 (+ 2 3)))
(is (= 0 (+)))

; Negation and subtraction
(is (= -2 (- 2)))
(is (= 2 (- 4 2)))

; Multiplication operator
(is (= 1 (*)))
(is (= 4 (* 2 2)))

; Division operator
(is (= 2 (/ 6 3)))
(is (= 1/2 (/ 2)))
(is (= 1 (/ 6 2 3)))

; Quotient operator
(is (= 2 (quot 4 2)))
(is (= 2 (quot 5 2)))
(is (= 0 (quot 2 4)))

; Remainder operator
(is (= 1 (rem 5 2)))
(is (= 0 (rem 4 2)))
(is (= 2 (rem 2 5)))
(is (= 2 (rem 2 -5)))
(is (= -2 (rem -2 5)))
(is (= -2 (rem -2 -5)))

; Modulus operator
(is (= 1 (mod 5 2)))
(is (= 0 (mod 4 2)))
(is (= -3 (mod 2 -5)))
(is (= 3 (mod -2 5)))
