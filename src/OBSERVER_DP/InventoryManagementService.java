package OBSERVER_DP;

public class InventoryManagementService implements OrderPlaceSubscriber, OrderCancelSubscriber {
    public void onOrderPlaceAction() {
        System.out.println("Inventory updated after order placed successfully");
    }
    public void onOrderCancelAction() {
        System.out.println("Inventory updated after order cancel successfully");
    }
}
