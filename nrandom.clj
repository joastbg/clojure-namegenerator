;; generates random pairs from vectors (ie name generator)

(def fl ["Johan", "Niklas", "Anders", "Kalle", "Victor"])
(def ll ["Nilsson", "Carlsson", "Andersen"])

(defn mn [n, l] (take n (repeatedly #(rand-nth l))))

(defn mnn [f,l] (reduce str [f," ",l]))
(defn mnl [n] (map mnn (mn n fl) (mn n ll)))

(apply println (mnl 5))
