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
  [:div {:class "flex space-x-2 flex-col"}
   [:h2 "Buttons"]
   [:div {:class "flex space-x-4"}
    [button {:color "gray"} "Gray"]
    [button {:color "coolGray"} "Cool Gray"]
    [button {:color "warmGray"} "Warm Gray"]
    [button {:color "blueGray"} "Blue Gray"]
    [button {:color "emerald"} "Emerald"]
    [button {:color "yellow"} "Yellow"]
    [button {:color "lime"} "Lime"]]
   [:h2 "Washed Buttons"]
   [:div {:class "flex space-x-4"}
    [button {:color "gray-washed"} "Gray"]
    [button {:color "coolGray-washed"} "Cool Gray"]
    [button {:color "warmGray-washed"} "Warm Gray"]
    [button {:color "blueGray-washed"} "Blue Gray"]
    [button {:color "emerald-washed"} "Emerald"]
    [button {:color "yellow-washed"} "Yellow"]
    [button {:color "lime-washed"} "Lime"]]
   [:h2 "Outlined Buttons"]
   [:div {:class "flex space-x-4"}
    [button {:color "gray-outlined"} "Gray"]
    [button {:color "coolGray-outlined"} "Cool Gray"]
    [button {:color "warmGray-outlined"} "Warm Gray"]
    [button {:color "blueGray-outlined"} "Blue Gray"]
    [button {:color "emerald-outlined"} "Emerald"]
    [button {:color "yellow-outlined"} "Yellow"]
    [button {:color "lime-outlined"} "Lime"]]])

(defn create-react-card [react-element]
  (ct.react/react-card
   (r/as-element [react-element])))

(ws/defcard button-card
  (ct.react/react-card
   (r/as-element [buttons])))
