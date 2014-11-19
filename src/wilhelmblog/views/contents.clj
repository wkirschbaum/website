(ns wilhelmblog.views.contents
  (:use [hiccup.element :only (link-to)]))

(defn- personal_summary []
  [:div
    "My name is Wilhelm Kirschbaum and I am a software developer living in Cape Town.
    I currently work for "
    (link-to "http://www.unboxedconsulting.com/" "Unboxed Consulting")
    ", a software delivery and consulting company.
    This site is here to share my findings of software development."])

(defn home []
  [:div (personal_summary)])

(defn contact []
  [:ul {:class "no-style"}
    [:li "email: wkirschbaum@gmail.com"]
    [:li "twitter: @wkirschbaum"]
  ])

(defn posts []
  [:div "I have not written anything yet."])