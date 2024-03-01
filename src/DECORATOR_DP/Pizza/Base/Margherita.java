package DECORATOR_DP.Pizza.Base;
import DECORATOR_DP.Pizza.Pizza;

public class Margherita implements Pizza {
    Margherita() {}
    @Override
    public double getCost() {
        return 200;
    }
    @Override
    public String getDescription() {
        return "Margherita";
    }
}
