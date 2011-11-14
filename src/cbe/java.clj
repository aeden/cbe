(ns cbe.java
  (:use [clojure.test]))

; Instantiation
(is (= "example" (new String "example")))
(is (= "example" (String. "example")))

; Instance method
(is (= "EXAMPLE" (.toUpperCase "example")))
(is (= "java.lang.String" (.getName String)))
(is (= java.lang.String (-> "example" (.getClass))))

; Class method
(is (= "1" (String/valueOf 1)))

; Constant
(is (= 1 (BigDecimal/ONE)))

; Instance method chaining
(is (= "class java.lang.String" (-> "example" (.getClass) (.toString))))

; Testing instance of
(is (instance? java.lang.String "example"))
(is (not (instance? java.lang.Integer "foo")))

; Treat a method as a function 
(is (= '(\r \h \y) (map #(.charAt %1 %2) ["fred" "ethel" "lucy"][1 2 3])))
(is (= '(\r \h \y) (map (memfn charAt i) ["fred" "ethel" "lucy"][1 2 3])))

