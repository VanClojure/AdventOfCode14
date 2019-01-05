(ns aoc14.next-loc)

(comment
  (def locations [0 1])
  (def recipes [3 7 1 0]))

(defn next-location [recipes locations]
  (let [a-loc (locations 0)
        b-loc (locations 1)
        a-jump (+ 1 (recipes a-loc))
        b-jump (+ 1 (recipes b-loc))
        a-next-loc (one-elf-next-loc (count recipes) a-loc a-jump)
        b-next-loc (one-elf-next-loc (count recipes) b-loc b-jump)

        ]

    [a-loc b-loc a-jump a-next-loc b-jump b-next-loc])
;; => [0 1 4 0 8 4] 

  )

(comment
  (def length 4)
  (def curr-index 1)
  (def jump 8))

(defn one-elf-next-loc [length curr-index jump]
  (mod (+ curr-index jump) length))

(comment
  (next-location recipes locations))


