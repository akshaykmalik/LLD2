package OBSERVER_DP;

public class RefundManagementService implements OrderCancelSubscriber {
    public void onOrderCancelAction() {
        System.out.println("Refund generated after order cancel successfully");
    }
}
