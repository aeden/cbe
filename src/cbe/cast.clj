(ns cbe.cast
  (:use [clojure.test]))

;Byte
(is (= java.lang.Byte (type (byte 1))))

;Short
(is (= java.lang.Short (type (short 1))))

;Integer
(is (= java.lang.Integer (type (int 1))))

;Long
(is (= java.lang.Long (type (long 1))))

;Float
(is (= java.lang.Float (type (float 1))))

;Double
(is (= java.lang.Double (type (double 1))))

;Big Decimal
(is (= java.math.BigDecimal (type (bigdec 1))))

;Big Integer
(is (= java.math.BigInteger (type (bigint 1))))

;Coerce to a number
;TODO: a better example?
(is (= 1 (num 1)))

;Convert to a rational number
(is (= 314/100 (rationalize 3.14)))
