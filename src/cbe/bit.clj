(ns cbe.bit
  (:use [clojure.test]))

; Bit-wise AND
(is (= 2r0010 (bit-and 2r0011 2r0010)))
(is (= 2r0000 (bit-and 2r0000 2r1111)))

;Bit-wise OR
(is (= 2r0110 (bit-or 2r0110 2r0000)))
(is (= 2r0110 (bit-or 2r0100 2r0110)))

;Bit-wise XOR
(is (= 2r0101 (bit-xor 2r0100 2r0001)))
(is (= 2r0010 (bit-xor 2r0101 2r0111)))

;Bit-wise NOT
(is (= -2r0001 (bit-not 2r0000)))

;Bit-flip
(is (= 2r1 (bit-flip 2r0 0)))
(is (= 2r010 (bit-flip 2r000 1)))
(is (= 2r1000 (bit-flip 2r0000 3)))

;Bit-set
(is (= 2r1 (bit-set 2r0 0)))
(is (= 2r1100 (bit-set 2r1000 2)))

;Bit shift right
(is (= 2r001 (bit-shift-right 2r010 1)))
(is (= 2r0010 (bit-shift-right 2r1000 2)))
(is (= 2r0 (bit-shift-right 2r1 1)))

;Bit shift left
(is (= 2r100 (bit-shift-left 2r010 1)))
(is (= 2r1000 (bit-shift-left 2r001 3)))

;Bit AND-NOT
(is (= 2r0 (bit-and-not 2r0 2r0)))
(is (= 2r0 (bit-and-not 2r0 2r1)))
(is (= 2r0 (bit-and-not 2r1 2r1)))
(is (= 2r1 (bit-and-not 2r1 2r0)))

;Bit clear
(is (= 2r0 (bit-clear 2r1 0)))
(is (= 2r0010 (bit-clear 2r0110 2)))

;Bit test
(is (bit-test 2r1 0))
(is (not (bit-test 2r001 1)))
