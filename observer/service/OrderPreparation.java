package service;

import model.Observable;

public class OrderPreparation implements Observer {

    private Observable order;

    public OrderPreparation(Observable order) {
        this.order = order;
        order.registerObserver(this);
    }

    @Override
    public void update(long orderId, String commodity, long quantity) {
        System.out.format("Preparing order: %d\n" +
                "- commodity: %s\n" +
                "- quantity: %d\n", orderId, commodity, quantity );
    }
}
