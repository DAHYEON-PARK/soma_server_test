package httpServer;

/**
 * Created by dahyeon on 2015. 10. 9..
 */
public class HTTPServerVerticle extends Verticle {
    private Logger logger;
    @Override
    public void start() {
        logger = container.logger();
        HttpServer httpServer = vertx.createHttpServer();
//-- When a request arrives, the request handler is called passing in an instance of HttpServerRequest.
//-- The handler is called when the headers of the request have been fully read.
        httpServer.requestHandler(new Handler<HttpServerRequest>() { @Override
                                                                     public void handle(HttpServerRequest request) { String method = request.method();
            String uri = request.uri();
            String path = request.path();
            String query = request.query();
            logger.info("received http request: {method=" + method+",
                    ￼3장 SockJS 채팅 서버/클라이언트 63
                    uri="+uri+", path="+path+", query="+query+"}");
            //-- Http request params
            List<Map.Entry<String, String>> params = request.params().entries();
            for(Map.Entry<String, String> param : params) { logger.info("param["+param.getKey()+"] = "+param.getValue());
            }
            //-- Http request headers
            List<Map.Entry<String, String>> headers = request.headers().entries();
            for(Map.Entry<String, String> header : headers) { logger.info("header["+header.getKey()+"] =
                    "+header.getValue()); }
//-- The body handler is called only once when the entire request body has been read.
                    request.bodyHandler(new Handler<Buffer>() { @Override
                                                                public void handle(Buffer buffer) { logger.info("received data: " + buffer.toString());
                    } });
                request.response().setStatusCode(200).end("OK"); }
        });
        httpServer.listen(8080, new Handler<AsyncResult<HttpServer>>() { @Override
                                                                         public void handle(AsyncResult<HttpServer> asyncResult) { logger.info("bind result: "+asyncResult.succeeded());
        } });
    } }