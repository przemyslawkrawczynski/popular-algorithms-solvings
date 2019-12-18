package pl.pk.algorithms.patterns.observer.companyObserver;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);
}
