(ns cbe.core
   (:use [clojure.test]))

;Unevaluated form
(is (= 3 (count '(a b c))))

;Try/catch/finally
(is 
  (= nil 
     (try (/ 1 0)
       (catch ArithmeticException e (prn "in exception")) 
       (finally (prn "in finally")))))
