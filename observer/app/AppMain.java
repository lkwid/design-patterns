package app;

import model.Order;
import service.OrderPreparation;

public class AppMain {

    public static void main(String[] args) {

        Order order = new Order();
        OrderPreparation orderPreparation = new OrderPreparation(order);

        order.createNew("Xbox One X", 1);
        order.createNew("Forza Horizon 4", 1);
        order.createNew("Bag of funny stuff", 5);
    }

}
