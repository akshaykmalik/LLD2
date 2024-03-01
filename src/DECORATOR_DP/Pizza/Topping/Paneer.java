package DECORATOR_DP.Pizza.Topping;

import DECORATOR_DP.Pizza.Pizza;

public class Paneer implements Pizza {
    Pizza pizza;
    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double getCost() {
        return 60 + pizza.getCost();
    }
    @Override
    public String getDescription() {
        return "Paneer " + pizza.getDescription();
    }
}
