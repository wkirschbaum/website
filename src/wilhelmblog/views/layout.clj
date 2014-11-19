(ns wilhelmblog.views.layout
  (:use [hiccup.page :only (html5 include-css)]
        [hiccup.element :only (link-to)]))

(defn application [title & content]
  (html5 [:head
    [:title (str "Happy Spike | " title)]
    [:meta {:charset "utf-8"}]
    [:meta {:name "viewport", :content "width=device-width initial-scale=1"}]
    [:meta {:http-equiv "X-UA-Compatible", :content "IE=edge"}]
    (include-css "css/core.css")]
    [:body
      [:ul {:class "menu-list"}
        [:li {:class "menu-item"} (link-to {:class "nav-link"} "/" "home") ]
        [:li {:class "menu-item"} (link-to {:class "nav-link"} "/posts" "posts") ]
        [:li {:class "menu-item"} (link-to {:class "nav-link"} "/contact" "contact") ]
      ]
      [:div {:class "container"}
        content
      ]
  ])
)