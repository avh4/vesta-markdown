(ns net.avh4.vesta.markdown.examples)

;; Examples from http://daringfireball.net/projects/markdown/basics

(def headers
  [[:h1 "A First Level Header"]
   [:h2 "A Second Level Header"]
   [:p "Now is the time for all good men to come to the aid of their country. This is just a regular paragraph."]
   [:p "The quick brown fox jumped over the lazy dog's back."]
   [:h3 "Header 3"]
   [:blockquote
    [:p "This is a blockquote."]
    [:p "This is the second paragraph in the blockquote."]
    [:h2 "This is an H2 in a blockquote"]]])
