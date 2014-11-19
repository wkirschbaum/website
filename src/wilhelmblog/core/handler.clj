(ns wilhelmblog.core.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [wilhelmblog.views.layout :as layout]
            [wilhelmblog.views.contents :as contents]))

(defroutes app-routes
  (GET "/" [] (layout/application "Home" (contents/home)))
  (GET "/posts" [] (layout/application "Posts" (contents/posts)))
  (GET "/contact" [] (layout/application "Contact" (contents/contact)))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))

