(ns main.buttons.button)

(defn button [color & children]
  "A simple button"
  (let [classes
        ["inline-flex"
         "items-center"
         "px-4"
         "py-2"
         "border"
         "border-gray-300"
         "rounded-md"
         "shadow-sm"
         "text-sm"
         "font-medium"
         "text-gray-700"
         "bg-white"
         "hover:bg-gray-50"
         "focus:outline-none"
         "active:bg-gray-100"]]
    [:button {:class classes} children]))
