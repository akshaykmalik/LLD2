package STRATEGY_DP;

public class GoogleMap {
    public void calculatePath(String source, String destination, TransportationMode tp) {
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorStrategy(tp);
        pathCalculatorStrategy.calculatePath(source, destination);
    }
}
