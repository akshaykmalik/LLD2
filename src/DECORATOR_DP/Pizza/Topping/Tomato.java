package DECORATOR_DP.Pizza.Topping;
import DECORATOR_DP.Pizza.Pizza;
public class Tomato implements Pizza {
    Pizza pizza;
    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double getCost() {
        return 3 + pizza.getCost();
    }
    @Override
    public String getDescription() {
        return "Tomato " + pizza.getDescription();
    }

}