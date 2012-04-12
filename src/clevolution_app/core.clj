(ns clevolution-app.core
  (:import [javax.imageio ImageIO]
           [java.io File])
  (:refer-clojure :exclude [* + - and or min max mod])
  (:use [clevolution.file-io :only [save-image
                                    get-generator-string
                                    read-image-from-file]]
        [clevolution.core :only [generate-random-image-file]]
        [clevolution.image_ops.nullary.gradient :only [X Y]]
        [clevolution.image_ops.nullary.noise :only [bw-noise]]
        [clevolution.image_ops.unary :only [abs sin cos atan log inverse blur *]]
        [clevolution.image_ops.binary :only [+ - and or xor min max mod]] :reload-all))

(def image-file-name "F:\\generated-images\\test.png")
; (def input-files (list "F:\\generated-images\\z-movie\\0000.png" "F:\\generated-images\\z-movie\\0453.png"))
; (def input-files (list "F:\\generated-images\\JieSpanningSmall.png" "C:\\Users\\alan\\Pictures\\NodenameImages\\zhengred400.png" "C:\\Users\\alan\\Pictures\\Dawn_on_Callipygea_400.png"))
(def input-files (list "C:\\Users\\alan\\Pictures\\Dawn_on_Callipygea_400.png"))

;(def max-depth 3)
(def max-depth 2)

;; (generate-random-image-file image-file-name max-depth input-files)
 (generate-random-image-file image-file-name max-depth)
