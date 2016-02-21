(ns bower)

(alter-meta! *ns* (fn [m] (assoc m :bower true)))

(def bower
  {"PolymerElements/paper-button" {:ns 'miraj.paper :name 'button}
   "PolymerElements/paper-card" {:ns 'miraj.paper :name 'card}
   "PolymerElements/iron-icon" {:ns 'miraj.iron :name 'icon}})

