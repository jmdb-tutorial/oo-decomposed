(ns oo-decomposed.polymorphism
  (:use [clojure.math.numeric-tower]))

;; Welcome to type polymorphism in clojure...

;; This code can be found at https://github.com/jmdb-tutorial/oo-decomposed

(defn rect [width height] {:Shape :Rect :width width :height height})

(defn square [side] (rect side side))

(defn circle [radius] {:Shape :Circle :radius radius})

(defmulti area :Shape)

(defmethod area :Rect [rectangle] (* (:width rectangle) (:height rectangle)))

(defmethod area :Circle [circle] (* (Math/PI) (expt (:radius circle) 2)))

(defmethod area :default [x] :oops)


(def r (rect 4 13))
(def s (square 2))
(def c (circle 12))

;;(area r)
;;(area s)
;;(area c)
;;(area {})


