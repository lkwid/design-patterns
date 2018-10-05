import java.util.ArrayList;

public class Order implements Subject {
    static long id;
    int quantity;
    String commodity;
    ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void broadcastToObservers() {
        observers.forEach(observer -> observer.prepareOrder(id, quantity, commodity));
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    void newOrderEvent(int quantity, String commodity) {
        this.id++;
        this.quantity = quantity;
        this.commodity = commodity;

        this.broadcastToObservers();
    }
}
