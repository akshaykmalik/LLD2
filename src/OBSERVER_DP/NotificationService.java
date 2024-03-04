package OBSERVER_DP;

public class NotificationService implements OrderPlaceSubscriber, OrderCancelSubscriber {
    public void onOrderPlaceAction() {
        System.out.println("Notification send on order placed successfully");
    }
    public void onOrderCancelAction() {
        System.out.println("Notification send on order cancel successfully");
    }
}
