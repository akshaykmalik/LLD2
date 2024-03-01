package DECORATOR_DP.iceCream;

public class OrangeCone implements Desert {
    Desert desert;
    /*
     * can ac as both base topping and normal topping
     * thus we can start with OrangeCone or we can put OrangeCone in between
     */
    OrangeCone(){
    }
    OrangeCone(Desert desert){
        this.desert = desert;
    }
    public double getPrice() {
        return this.desert.getPrice() + 10.0;
    }
    public String getDescription() {
        return this.desert.getDescription() + ", Orange Cone";
    }
}

