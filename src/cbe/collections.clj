(ns cbe.collections
 (:use [clojure.test]))

;Count items in a collection
(is (= 3 (count [1 "a" :foo])))
(is (= 3 (count {1 2 "a" "x" :foo "bar"})))

;Empty
(is (= [] (empty ["foo" "bar"])))
(is (= {} (empty {1 "a" 2 "b"})))
(is (= nil (empty nil)))

;Nil on an empty collection, or the collection
(is (= nil (not-empty [])))
(is (= [1 "a"] (not-empty [1 "a"])))

;Conjoin the second collection into the first
(is (= [1 2 3] (into [] [1 2 3])))
(is (= [1 "a" 2 :foo] (into [1 "a"] [2 :foo])))
(is (= {"a" 1 :b 2} (into {"a" 1} {:b 2})))

;Conjoin the item into the collection
(is (= [1 2] (conj [1] 2)))
(is (= [1] (conj nil 1)))
(is (= [3 2 1] (conj nil 1 2 3)))
(is (= [3 2 1 ["a" "b"]] (conj nil ["a" "b"] 1 2 3)))
