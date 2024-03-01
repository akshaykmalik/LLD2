package DECORATOR_DP.iceCream;

public class Serup implements Desert {
    Desert desert;
    Serup(Desert desert) {
        this.desert = desert;
    }
    public double getPrice() {
        return this.desert.getPrice() + 15.0;
    }
    public String getDescription() {
        return this.desert.getDescription() + ", Serup";
    }
}
