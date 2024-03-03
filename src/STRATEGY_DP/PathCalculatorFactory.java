package STRATEGY_DP;



public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategy(TransportationMode transportationMode) {
        switch(transportationMode) {
            case BIKE : return new BikePathCalculatorStrategy();
            case BUS : return new BusPathCalculatorStrategy();
            case WALKING : return new WalkingPathCalculatorStrategy();
            default : return null;
        }
    }
}
