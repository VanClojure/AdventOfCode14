(ns aoc14.next-loc)

(comment
  (def locations [0 1])
  (def recipes [1 1 4 5 3 2]))

(defn next-location [recipes locations]
  (let [a-loc (locations 0)
        b-loc (locations 1)
        a-next-loc (+ a-loc (+ 1 (recipes a-loc)))
        b-next-loc (+ b-loc (+ 1 (recipes b-loc)))]
    [a-loc b-loc a-next-loc b-next-loc]))

(comment
  (def length 2)
  (def curr-index 0)
  (def jump 3))

(defn one-elf-next-loc [length curr-index jump]
  (mod (+ curr-index jump) length))

(comment
  (next-location recipes locations))


