((fn [a](println a))"Hello Wold")
(def func (fn [a](println a)))
(func "hello wold...")

(defn soma [a b] (+ a b))
(println (soma 3 5))

(if (= 2 2 (- 9 7))
    (println "Verdadeiro")
    (println "falso"))


(def A 5)
(def B 3)

(def C (rem B A))

(if ( = C 0)
    (do
        (println "uscs")
        (println "professor")
    )
    (do
        (println "Clojure muito legal")
    )
)
(println "C = " C)
(println "Fim de programa")



(let [m "professor"]
      (println m)
      )
