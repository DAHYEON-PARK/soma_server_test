package test;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Verticle;
import io.vertx.core.http.HttpServerRequest;

/**
 * Created by dahyeon on 2015. 10. 7..
 */
public class JavaServerTest extends AbstractVerticle {

//    @Override
//    public void start(Future<Void> startFuture) throws Exception {
//        //super.start(startFuture);
//        vertx
//                .createHttpServer()
//                .requestHandler(r -> {
//                    r.response().end("<h1>Hello from my first " +
//                            "Vert.x 3 application</h1>");
//                })
//                .listen(8080, result -> {
//                    if (result.succeeded()) {
//                        startFuture.complete();
//                    } else {
//                        startFuture.fail(result.cause());
//                    }
//                });
//    }

}