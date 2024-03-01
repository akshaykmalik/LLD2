package DECORATOR_DP.iceCream;

public class VanillaCone implements Desert  {
    // it is a base topping so we have not added constructor that take Desert as parameter
    public double getPrice() {
        return 12.0;
    }
    public String getDescription() {
        return "Vanilla Cone";
    }
}
