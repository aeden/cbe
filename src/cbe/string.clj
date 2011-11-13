(ns cbe.string
  (:use [clojure.test]))

;Empty string
(is (= "" (str)))
(is (= "" (str nil)))

;Convert to string
(is (= "1" (str 1)))
(is (= "1.0" (str 1.0)))

;Concatenate strings
(is (= "hello world" (str "hello " "world")))

;TODO: print-str

;TODO: println-str

;TODO: pr-str

;TODO: prn-str

;TODO: with-out-str

;Count chars in a string
(is (= 11 (count "hello world")))

;Get the char at the given index
(is (= \o (get "hello world", 4)))

;Substring
(is (= "world" (subs "hello world" 6)))
(is (= "wor" (subs "hello world" 6 9)))

;Format string
(is (= "hello world" (format "%s %s", "hello", "world")))

;Is a value a string?
(is (string? "hello world"))
(is (not (string? 12)))

;Additional functions in clojure for working with strings
(require 'clojure.string)

;Is a string blank?
(is (clojure.string/blank? "   "))
(is (clojure.string/blank? ""))
(is (not (clojure.string/blank? "hello")))

;Capitalize
(is (= "Hello" (clojure.string/capitalize "hello")))

;Lower case
(is (= "hello" (clojure.string/lower-case "HELLO")))

;Upper case
(is (= "HELLO" (clojure.string/upper-case "hello")))

;Join
(is (= "helloworld" (clojure.string/join ["hello" "world"])))
(is (= "hello world" (clojure.string/join " " ["hello" "world"])))

;Escape
(is (= "&lt;hello" (clojure.string/escape "<hello" {\<, "&lt;"}))) 

;Split
(is (= ["hello" "world" "and" "good" "morning"] (clojure.string/split "hello world   and good    morning" #"\s+")))
(is (= ["hello" "world and good morning"] (clojure.string/split "hello world and good morning" #"\s+" 2)))

;Split lines
(is (= ["hello world" "have a good day!"] (clojure.string/split-lines "hello world\nhave a good day!")))
(is (= ["hello world" "have a good day!"] (clojure.string/split-lines "hello world\r\nhave a good day!")))

;Replace
(is (= "he11o wor1d" (clojure.string/replace "hello world" "l" "1")))
(is (= "hell0 w0rld" (clojure.string/replace "hello world" \o \0)))
(is (= "hOllO wOrld" (clojure.string/replace "hello world" #"[e|o]" "O")))

;Replace the first match
(is (= "hOllo world" (clojure.string/replace-first "hello world" #"[e|o]" "O")))

;Reverse string
(is (= "dlrow olleh" (clojure.string/reverse "hello world")))

;Trim
(is (= "hello world" (clojure.string/trim "    hello world    \n")))

;Trim newline
(is (= "    hello world    " (clojure.string/trim-newline "    hello world    \n")))

;Trim left
(is (= "hello world    \n" (clojure.string/triml "    hello world    \n")))

;Trim right
(is (= "    hello world" (clojure.string/trimr "    hello world    \n")))
