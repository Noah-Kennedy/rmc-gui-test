(defproject rmc-gui-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [venantius/pyro "0.1.2"]
                 [aleph "0.4.4"]]
  :main ^:skip-aot rmc-gui-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
