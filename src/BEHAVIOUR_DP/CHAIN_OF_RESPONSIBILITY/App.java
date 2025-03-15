package BEHAVIOUR_DP.CHAIN_OF_RESPONSIBILITY;

public class App {
    public static void main(String[] args) {
        Server server = new Server();
        Middleware firstMiddleware = Middleware.link(
            new RateLimiterMiddleware(),
            new AuthenticationMiddleware()
        );

        server.setMiddleware(firstMiddleware);

        Request req = new Request("1.1.1.1" , "johnDoe", "johnDoe9");
        Response resp = new Response();

        System.out.println(server.handleRequest(req, resp));
        System.out.println(server.handleRequest(req, resp));
        System.out.println(server.handleRequest(req, resp));

    }
}
