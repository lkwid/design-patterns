public class ShopOrderApp {

    public static void main(String[] args) {
        Order order = new Order();
        Observer preparation = new Preparation(order);

        order.newOrderEvent(2, "XBOX ONE X");
    }
}
