(ns cbe.functions
  (:use [clojure.test]))

;Define a function
(def add-fn (fn [a b] (+ a b)))
(is (= 3 (add-fn 1 2)))

;Define a function with defn macro
(defn add-defn [a b]
  (+ a b))
(is (= 3 (add-defn 1 2)))

