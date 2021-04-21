(ns workspaces.main
  (:require [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.react :as ct.react]
            [main.buttons.button :refer [button]]
            [reagent.core :as r]))

(defn on-js-load [] (ws/after-load))
(defonce init (ws/mount))

(defn ^:dev/after-load start []
  (ws/after-load))

; simple function to create react elemnents

(defn example-component []
  [:div "hello!!!"])

(defn buttons []
  [:div
   [button {:color "red"} "Hello"]
   [button {:color "red"} "World"]])

(defn create-react-card [react-element]
  (ct.react/react-card
   (r/as-element [react-element])))

(ws/defcard hello-card
  (create-react-card example-component))

(ws/defcard button-card
  (ct.react/react-card
   (r/as-element [buttons])))
