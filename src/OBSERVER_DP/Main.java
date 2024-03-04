package OBSERVER_DP;

public class Main {
    public static void main(String[] args) {
        NotificationService ns = new NotificationService();
        InvoiceGeneratorService igs = new InvoiceGeneratorService();
        InventoryManagementService ims = new InventoryManagementService();
        RefundManagementService rms = new RefundManagementService();

        Amazon amazon = new Amazon();
        amazon.registerOrderPlaceSubscriber(ns);
        amazon.registerOrderPlaceSubscriber(igs);
        amazon.registerOrderPlaceSubscriber(ims);
       
        amazon.registerOrderCancelSubscriber(ns);
        amazon.registerOrderCancelSubscriber(ims);
        amazon.registerOrderCancelSubscriber(rms);

        amazon.placeOrder();
        amazon.cancelOrder();

        System.out.println("----------------------------------");
        
        amazon.deRegisterOrderPlaceSubscriber(ns);
        amazon.deRegisterOrderCancelSubscriber(ns);

        amazon.placeOrder();
        amazon.cancelOrder();

    }
}
