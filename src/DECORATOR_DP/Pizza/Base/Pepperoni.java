package DECORATOR_DP.Pizza.Base;
import DECORATOR_DP.Pizza.Pizza;

public class Pepperoni implements Pizza{
    Pepperoni() {};
    @Override
    public double getCost() {
        return 180;
    }
    @Override
    public String getDescription() {
        return "Pepperoni";
    }
}
