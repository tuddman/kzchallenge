(defproject kzchallenge "0.1.0"
  :description ""
  :url "https://github.com/tuddman/kzchallenge"
  :license {:name "unlicense"
            :url "https://unlicense.org/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [org.clojure/tools.cli "0.4.1"]
                 [org.xerial/sqlite-jdbc "3.25.2"]
                 [java-jdbc/dsl "0.1.3"]
                 [bidi "2.1.4"]
                 [bouncer "1.0.1"]
                 [buddy/buddy-auth "2.1.0"]
                 [buddy/buddy-core "1.5.0"]
                 [buddy/buddy-hashers "1.3.0"]
                 [buddy/buddy-sign "3.0.0"]
                 [cheshire "5.8.1"]
                 [clj-http "3.9.1"]
                 [clj-time "0.14.4"]
                 [com.taoensso/timbre "4.10.0"]
                 [danlentz/clj-uuid "0.1.7"] 
                 [http-kit "2.3.0"]
                 [liberator "0.15.2"]
                 [compojure "1.6.1"] 
                 [ring/ring-core "1.7.0"]
                 [ring/ring-jetty-adapter "1.7.0"]
                 [ring/ring-json "0.4.0"]
                 [ring-cors "0.1.12"]
                 [ring/ring-defaults "0.3.2"]
                 [ring-middleware-format "0.7.2" :exclusions [ring]]]
  :min-lein-version "2.5.1"
  :main kzchallenge.server
  :profiles  {:dev  {:dependencies  [[org.clojure/test.check "0.9.0"]]}
              :uberjar  {:main kzchallenge.server, :aot :all}
              :production  {:env {:production true}}}
  :uberjar-name "employees-standalone.jar"  
  :repl-options {:timeout 60000}) 
