(ns cbe.vector
  (:use [clojure.test]))

; Vector construction
(is (= [1 2 3 4] (vector 1 2 3 4)))
(is (= [1 2 3 4] (vec '(1 2 3 4))))

; Get
(is (= 2 (get [1 2 3] 1)))
(is (= nil (get [1 2] 3)))

; nth
(is (= 3 (nth [1 2 3] 2)))
(is (thrown? java.lang.IndexOutOfBoundsException (nth [1 2 3] 3)))
(is (= "a" (nth [1 2 3] 3 "a")))

; peek
(is (= 3 (peek [1 2 3])))
(is (= nil (peek [])))

; rseq (reverse)
(is (= [3 2 1] (rseq [1 2 3])))
(is (= nil (rseq [])))

; vector?
(is (vector? [1 2 3]))
(is (not (vector? '(1 2 3))))

; assoc(iate)
(is (= [1 "A" 3] (assoc [1 2 3] 1 "A")))

; pop
(is (= [1 2] (pop [1 2 3])))
(is (thrown? java.lang.IllegalStateException (pop '())))

; subvec
(is (= [1 2] (subvec [1 2 3 4] 0 2)))
(is (= [2 3 4] (subvec [1 2 3 4] 1)))

; replace
(is (= [1 "a" 3] (replace {2 "a"} [1 2 3])))

; Conj
(is (= [1 2 3] (conj [1 2] 3)))
