;;; Examples using higher-order functions.

(defn compose
  "Returns a new function that represents the composition
  of f and g: f(g(x))."
  [f g]
  (fn [x]
    (f (g x))))

(defn f1 [x] (* 3 x))

(defn f2 [x] (+ x 4))

(def f3 (compose f1 f2))

(def f4 (compose f2 f1))

(def f5 (compose f3 f4))
