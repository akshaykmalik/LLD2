package BEHAVIOUR_DP.CHAIN_OF_RESPONSIBILITY;

public class Server {
    Middleware middleware;
    Server(){}
    Server(Middleware middleware) {
        this.middleware = middleware;
    }

    void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    String handleRequest(Request req, Response resp) {
        boolean passedMiddleware =   middleware.handle(req, resp);
        if(!passedMiddleware) {
            return resp.getMessage(); 
        }
        return "request handled";
    }
}
