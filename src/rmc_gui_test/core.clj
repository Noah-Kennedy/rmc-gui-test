(ns rmc-gui-test.core
  (:require aleph.tcp
            [manifold.stream :as s]
            [pyro.printer :as printer])
  (:gen-class))

(set! *warn-on-reflection* true)
(printer/swap-stacktrace-engine!)

(defn handle-new-message [message]
  (print message))

(defn handle-new-connection [stream _]
  (s/consume
    (fn [bytes]
      (-> bytes
          (byte-streams/convert String)
          (handle-new-message)))
    stream))

(defn -main []
  (aleph.tcp/start-server handle-new-connection {:port 2401}))