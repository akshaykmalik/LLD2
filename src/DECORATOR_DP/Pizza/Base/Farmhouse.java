package DECORATOR_DP.Pizza.Base;
import DECORATOR_DP.Pizza.Pizza;

public class Farmhouse implements Pizza {
    final String NAME = "Farmhouse";
    Pizza pizza;
    Farmhouse() {}
    public double getCost() {
        return 150 ;
    }
    public String getDescription() {
        return "Farmhouse";
    }
}