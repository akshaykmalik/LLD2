package DECORATOR_DP.iceCream;

public class MakeIceCream {
    public static void main(String[] args) {
        Desert desert = new VanillaCone();
        desert = new Serup(desert);
        desert = new OrangeCone(desert);
        
        System.out.println(desert.getDescription() + " : " + desert.getPrice());

        // we cannot use vanilla cone in between as normal topping
        // Desert d = new VanillaCone(new OrangeCone());


    }
}
