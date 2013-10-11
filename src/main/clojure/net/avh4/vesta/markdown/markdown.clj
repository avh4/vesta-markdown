(ns net.avh4.vesta.markdown.markdown)

(defn- bq [s]
  (str "> "
       (-> s
           (clojure.string/replace "\n" "\n> ")
           (clojure.string/replace #"> \n> \z" ""))))

(defn- item [s]
  (case (first s)
    :h1 (str "# " (second s) "\n\n")
    :h2 (str "## " (second s) "\n\n")
    :p (str (second s) "\n\n")
    :h3 (str "### " (second s) "\n\n")
    :blockquote (bq (apply str (map item (rest s))))
    (str s)))

(defn ->markdown [s]
  (apply str (map item s)))
