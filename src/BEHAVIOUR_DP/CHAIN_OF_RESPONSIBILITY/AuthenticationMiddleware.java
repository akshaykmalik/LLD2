package BEHAVIOUR_DP.CHAIN_OF_RESPONSIBILITY;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationMiddleware extends Middleware {
    HashMap<String, String> userAuthMap = new HashMap<>(Map.ofEntries(Map.entry("johnDoe", "johnDoe9")));
    
    @Override
    boolean handle(Request req, Response resp) {
        String password = userAuthMap.get(req.username);
        if(password == null || password != req.password) {
            resp.setMessage("unauthentiated");
            return  false;
        }

        return handleNext(req, resp);
    }
}
