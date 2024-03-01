package DECORATOR_DP.Pizza;
import DECORATOR_DP.Pizza.Base.*;
import DECORATOR_DP.Pizza.Topping.*;

public class MakePizza {
    public static void main(String[] args) {
        Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(pizza.getDescription() + " : " + pizza.getCost());
    }
}
