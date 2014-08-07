(ns comiclist.test.handler
  (:use clojure.test
        ring.mock.request
        comiclist.handler))

(deftest test-app
  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404))))

  (testing "Home route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))))

(testing "About route"
  (let [response (app (request :get "/about"))]
    (is (= (:status response) 200))))
  ; this is the story of comiclist... work in progress
  )