(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :dependencies
  [[adzerk/boot-cljs "1.7.170-3"]
   [adzerk/boot-reload "0.4.2"]
   [compojure "1.4.0"]
   [hoplon/boot-hoplon "0.1.10"]
   [hoplon/castra "3.0.0-SNAPSHOT"]
   [hoplon/hoplon "6.0.0-alpha11"]
   [org.clojure/clojure "1.7.0"]
   [org.clojure/clojurescript "1.7.189"]
   [pandeiro/boot-http "0.7.0"]
   [ring "1.4.0"]
   [ring/ring-defaults "0.1.5"]]
  :source-paths
  ["src/hl" "src/castra" "src/cljs" "assets" "src/clj"])