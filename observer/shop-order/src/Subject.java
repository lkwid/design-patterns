public interface Subject {

    void broadcastToObservers();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

}
