package OBSERVER_DP;

public class InvoiceGeneratorService implements OrderPlaceSubscriber {
    public void onOrderPlaceAction() {
        System.out.println("Invoice generated after order placed successfully");
    }
}
