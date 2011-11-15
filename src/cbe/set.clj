(ns cbe.set
  (:use [clojure.test]))

; Set construction
(is (= #{1 2 3 4} (hash-set 1 2 3 4)))
(is (= #{1 2 3 4} (sorted-set 4 2 3 1)))
(is (= #{1 2 3 4} (sorted-set-by (fn [a b] a < b) 3 2 1 4)))
(is (= #{1 2 3 4} (set [1 2 3 4 4])))
(is (thrown? java.lang.IllegalArgumentException (hash-set 1 1)))

; Conj
(is (= #{1 2 3} (conj #{1 2} 3)))

; Disj
(is (= #{1 2} (disj #{1 2 3 4} 3 4)))

; Get
(is (= "b" (get #{"a" "b" "c"} "b")))
(is (= "c" (get #{"a" "b" "c"} "c" "woof")))
(is (= "woof" (get #{"a" "b"} "c" "woof")))
