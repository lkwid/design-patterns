package model;

import service.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {

    private static long id;
    private String commodity;
    private int quantity;
    private List<Observer> observers;

    public Order() {
        observers = new ArrayList<>();
    }

    public void createNew(String commodity, int quantity) {
        id++;
        this.commodity = commodity;
        this.quantity = quantity;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(id, this.commodity, this.quantity));
    }
}
