(ns main.buttons.button)

(def classes
  ["inline-flex"
   "items-center"
   "px-6"
   "py-2"
   "border"
   "rounded-md"
   "shadow-sm"
   "text-sm"
   "font-medium"
   "focus:outline-none"])

(defn get-color-by-type
  "Get Buttons color by their type"
  [color type]
  (cond
    (= type "washed") [(str "bg-" color "-200") (str "hover:bg-" color "-100") (str "active:bg-" color "-50") (str "border-" color "-300") (str "text-" color "-700")]
    (= type "outlined") [(str "bg-" color "-100") (str "hover:bg-" color "-50") "active:bg-white" (str "border-" color "-300") (str "text-" color "-700")]
    :else [(str "bg-" color "-300") (str "hover:bg-" color "-200") (str "active:bg-" color "-100") (str "border-" color "-300") (str "text-" color "-700")]))

(defn generate-color-type
  "string"
  [color]
  {(str color) (get-color-by-type color nil)
   (str color "-washed") (get-color-by-type color "washed")
   (str color "-outlined") (get-color-by-type color "outlined")})

(defn generate-color-map [& colors]
  (reduce (fn [acc color] (merge acc (generate-color-type color)))
          {}
          colors))

(def color->class (generate-color-map "gray" "blueGray" "coolGray" "warmGray" "emerald" "lime" "yellow"))

(def default-color ["bg-white" "hover:bg-gray-50" "active:bg-gray-100"])

(defn button
  "A simple button"
  [{:keys [color]} & children]
  [:button {:class (concat classes (color->class color default-color))} children])
