(ns tic-tac-toe-clojure.core
  (:gen-class))

(def board [[:x :e :o]           
            [:x :e :o]
            [:o :e :o]])  
       
(defn -main []
  (let [[[a b c]
         [d e f]
         [g h i]] board
        solutions (hash-set
                    [a b c]
                    [d e f]
                    [g h i]
                    [a d g]
                    [b e h]
                    [c f i]
                    [a e i]
                    [c e g])]
    (cond
      (contains? solutions [:x :x :x])
      (println "X won!")
      
      (contains? solutions [:o :o :o])
      (println "O won!")
      
      :else
      (println "Nobody won!"))))
    
 
