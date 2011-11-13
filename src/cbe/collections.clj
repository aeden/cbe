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

;Distinct?
(is (distinct? 1 2 3 4 5))
(is (not (distinct? 1 2 1)))
(is (not (distinct? [1 2] [1 2])))

;Empty?
(is (empty? []))
(is (empty? {}))
(is (empty? nil))

;Every?
(is (every? (fn [n] (= n 1)) [1 1 1]))
(is (not (every? (fn [n] (= n "foo")) [1 1 1])))

;Not every?
(is (not-every? (fn [n] (= n 1)) [1 2 1]))
(is (not (not-every? (fn [n] (= n :a)) [:a :a :a])))

;Some?
(is (some #{:a} [:b :a :a :b]))
(is (some (fn [n] (= n 1)) [2 2 1]))
(is (= "x" (some #{"x"} ["a" "t" "x"])))

;Not any?
(is (not-any? (fn [n] (= n 1)) [2 3 4]))
(is (not (not-any? (fn [n] (= n 1)) [2 3 1])))

;Sequential?
(is (sequential? [1 2 3]))
(is (not (sequential? 1)))
(is (not (sequential? {:foo 1 :bar 2 :baz 3})))

;Associative
(is (associative? {:a 1 :b 2}))
(is (associative? [1 2]))
(is (not (associative? 1)))

;Sorted?
(def my-map {:a 1 :b 2})
(is (sorted? (into (sorted-map) my-map)))
(is (sorted? (sorted-map :a 1 :b 2)))

;Counted?
(is (counted? [1 2 3]))
(is (not (counted? "abcd")))

;Collection?
(is (coll? [1 2 3]))
(is (not (coll? "abcd")))

;Sequence?
(is (seq? '(1 2 3)))
(is (not (seq? [1 2 3])))
