package DECORATOR_DP.Pizza.Base;

import DECORATOR_DP.Pizza.Pizza;

public class BBQChicken implements Pizza{
    public BBQChicken() {} 
    @Override
    public double getCost() {
        return 200;
    }
    public String getDescription() {
        return "BBQ Chicken";
    }
}
