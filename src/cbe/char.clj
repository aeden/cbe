(ns cbe.char
  (:use [clojure.test]))

;Coerce to a character
(is (= \a (char 97)))
(is (= \return (char 13)))

;Is a value a character
(is (char? \a))
(is (not (char? "a")))
