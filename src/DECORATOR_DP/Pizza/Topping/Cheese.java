package DECORATOR_DP.Pizza.Topping;
import DECORATOR_DP.Pizza.Pizza;

public class Cheese implements Pizza {
    Pizza pizza;
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double getCost() {
        return 80 + pizza.getCost();
    }
    @Override
    public String getDescription() {
        return "Cheese " + pizza.getDescription();
    }
}
