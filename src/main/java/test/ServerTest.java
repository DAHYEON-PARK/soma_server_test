package test;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerRequest;

/**
 * Created by dahyeon on 2015. 10. 7..
 */
public class ServerTest extends AbstractVerticle {

//    public void start() {
//        vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
//            public void handle(HttpServerRequest req) {
//                String file = req.path().equals("/") ? "index.html" : req.path();
//                req.response().sendFile("webroot/" + file);
//            }
//        }).listen(8080);
//    }

}
