package BEHAVIOUR_DP.CHAIN_OF_RESPONSIBILITY;

public abstract class Middleware {
    private Middleware next;

    static Middleware link(Middleware ...middlewares) {
        Middleware head = null, temp = null;
        for(Middleware middleware : middlewares) {
            if(head == null) {
                head = temp = middleware;
            } else {
                temp.next = middleware;
            }
        }
        return head;
    }

    abstract boolean handle(Request request, Response response);
    protected boolean handleNext(Request request, Response response) {
        if(next == null) {
            return true;
        } 

        return  next.handle(request, response);
    }
}
