package OBSERVER_DP;
import java.util.List;
import java.util.ArrayList;

public class Amazon {
    List<OrderPlaceSubscriber> orderPlaceSubscribers;
    List<OrderCancelSubscriber> orderCancelSubscribers;
    
    Amazon() {
        orderPlaceSubscribers = new ArrayList<>();
        orderCancelSubscribers = new ArrayList<>();
    }
    public void registerOrderPlaceSubscriber(OrderPlaceSubscriber sub) {
        orderPlaceSubscribers.add(sub);
       
    }
    public void deRegisterOrderPlaceSubscriber(OrderPlaceSubscriber sub) {
        orderPlaceSubscribers.remove(sub);
    }
    public void registerOrderCancelSubscriber(OrderCancelSubscriber sub) {
        orderCancelSubscribers.add(sub);
    }
    public void deRegisterOrderCancelSubscriber(OrderCancelSubscriber sub) {
        orderCancelSubscribers.remove(sub);
    }
    public void placeOrder() {
        orderPlaceSubscribers.forEach((sub)->{sub.onOrderPlaceAction();});
    }
    public void cancelOrder() {
        orderCancelSubscribers.forEach((sub) -> {sub.onOrderCancelAction();});
    }

}
