(ns cbe.list
  (:use [clojure.test]))

; List construction
(is (= '(1 2 3 4) (list 1 2 3 4)))
(is (= '(1 2 3 4) (list* 1 2 [3 4])))

; Peek
(is (= 1 (peek '(1 2 3 4))))
(is (= nil (peek '())))

; Pop
(is (= '(2 3 4) (pop '(1 2 3 4))))
(is (thrown? java.lang.IllegalStateException (pop '())))

; First
(is (= 1 (first '(1 2 3 4))))
(is (= nil (first '())))

; Rest
(is (= '(2 3 4) (rest '(1 2 3 4))))
(is (= '() (rest '())))

; Cons
(is (= '(1 2 3) (cons 1 '(2 3))))

; Conj
(is (= '(3 1 2) (conj '(1 2) 3)))
(is (= '(4 3 1 2) (conj '(1 2) 3 4)))
(is (= '(1) (conj nil 1)))

