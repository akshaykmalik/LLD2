package DECORATOR_DP.Pizza.Topping;
import DECORATOR_DP.Pizza.Pizza;
public class Olive implements Pizza {
    Pizza pizza;
    Olive(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double getCost() {
        return 20 + pizza.getCost();
    }
    @Override
    public String getDescription() {
        return "Olive " + pizza.getDescription();
    }

}
