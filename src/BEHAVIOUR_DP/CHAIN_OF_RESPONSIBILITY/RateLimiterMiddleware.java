package BEHAVIOUR_DP.CHAIN_OF_RESPONSIBILITY;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterMiddleware extends Middleware {
    HashMap<String,Integer> requestIPMap = new HashMap<>(Map.ofEntries(Map.entry("1.1.1.1",0)));

    @Override
    boolean handle(Request req, Response resp) {
        int hitCount = requestIPMap.getOrDefault(req.ip, 0);
        requestIPMap.put(req.ip , ++hitCount);

        if(hitCount > 2) {
            resp.setMessage("rate limit exceed.");
            return false;
        } 
        
        return handleNext(req, resp);
    }
}
