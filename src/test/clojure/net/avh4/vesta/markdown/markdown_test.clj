(ns net.avh4.vesta.markdown.markdown-test
  (:use net.avh4.vesta.markdown.markdown
        midje.sweet)
  (:require [net.avh4.vesta.markdown.examples :as examples]))

(fact "->markdown renders a document as markdown source"
      (->markdown examples/headers)
      => (str "# A First Level Header\n\n"
              "## A Second Level Header\n\n"
              "Now is the time for all good men to come to the aid of their country. This is just a regular paragraph.\n\n"
              "The quick brown fox jumped over the lazy dog's back.\n\n"
              "### Header 3\n\n"
              "> This is a blockquote.\n"
              "> \n"
              "> This is the second paragraph in the blockquote.\n"
              "> \n"
              "> ## This is an H2 in a blockquote\n"))
