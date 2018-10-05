public class Preparation implements Observer {

    long id;
    long orderId;
    int quantity;
    String commodity;
    Subject order;

    public Preparation(Subject order) {
        this.order = order;
        order.addObserver(this);
    }

    @Override
    public void prepareOrder(long id, int quantity, String commodity) {
        this.orderId = id;
        this.quantity = quantity;
        this.commodity = commodity;

        broadcastOrder();
    }

    public void broadcastOrder() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Preparing " +
                "orderId=" + orderId +
                ", quantity=" + quantity +
                ", commodity='" + commodity + '\'';
    }
}
