(ns aoc14.next-loc-test
  (:require [aoc14.next-loc :as sut]
            [clojure.test :refer :all ]))

(deftest next-location-tests
  (testing "that the next location of the elves is correct"
    ;; (is (let [current-recipes [1 1 4 5 3 2]
    ;;           ;; [(1) [1] 4 5 3 2]
    ;;           curr-elf-pos [0 1]
    ;;           next-pos [1 2]]
    ;;       (= next-pos (sut/next-location
    ;;                    current-recipes
    ;;                    curr-elf-pos))))
    (is (let [ ;; recipes [2 1 3]
              ;; locations [0 1]
              jump 3
              recipe-length 3
              curr-loc 0
              a-new-loc 0]
          (= a-new-loc (sut/one-elf-next-loc recipe-length curr-loc jump))))
    (is (let [ ;; recipes [3 7 1. 0,]
              ;; locations [0 1]
              jump 4
              recipe-length 4
              curr-loc 0
              a-new-loc 0]
          (= a-new-loc (sut/one-elf-next-loc recipe-length curr-loc jump))))))
