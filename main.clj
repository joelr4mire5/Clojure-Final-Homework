(def abecedario (seq "abcdefghijklmnopqrstuvwxyz"))

(defn encriptacion [texto valor]
  (let [cifrado (->> (cycle abecedario)
                    (drop valor)
                    (take 26)
                    (zipmap abecedario))]
  (apply str (replace cifrado texto))))

(encriptacion (read-line) 1)