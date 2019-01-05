(ns aoc14.core-test
  (:require [clojure.test :refer :all]
            [aoc14.core :refer :all]))

#_(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest next-recipes-tests
  (is (= (next-recipes [3 7])
         [3 7 1 0])))
