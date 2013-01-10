(defproject org.clojars.bbirec/bandalore "0.0.3-SNAPSHOT"
  :description "A Clojure client library for Amazon's Simple Queue Service (SQS). Forked from https://github.com/cemerick/bandalore."
  :url "https://github.com/bbirec/bandalore"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.amazonaws/aws-java-sdk "1.3.26"]]
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"])