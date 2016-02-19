(ns styles)

(alter-meta! *ns*
             (fn [m] (assoc m
                            :co-ns true
                            :resource-type :css)))

(def main {:uri "styles/main.css"
            :media "(min-width: 700px) and (orientation: landscape)"})

(def hello {:uri "styles/foo.css"})

(def world {:uri "styles/bar.css"})
