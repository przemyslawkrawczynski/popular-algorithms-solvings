package pl.pk.algorithms.patterns.observer.companyObserver;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Observable {

    private List<Observer> employess;
    private List<String> orders;
    private String name;
    private long lastNumbersOfOrders;

    public Boss(String name) {
        this.employess = new ArrayList<>();
        this.orders = new ArrayList<>();
        lastNumbersOfOrders = 0;
        this.name = name;
    }

    public void setNewRecommendationToEmployess(String recommendation) {
        orders.add(recommendation);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        employess.add(observer);
    }

    @Override
    public void notifyObserver() {
        if (lastNumbersOfOrders < orders.size()) {
            for (Observer employee : employess) {
                employee.update(orders.get(orders.size() - 1));
            }
            lastNumbersOfOrders++;
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        employess.remove(observer);
    }

    public List<Observer> getEmployess() {
        return employess;
    }

    public void setEmployess(List<Observer> employess) {
        this.employess = employess;
    }

    public List<String> getOrders() {
        return orders;
    }

    public void setOrders(List<String> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLastNumbersOfOrders() {
        return lastNumbersOfOrders;
    }

    public void setLastNumbersOfOrders(long lastNumbersOfOrders) {
        this.lastNumbersOfOrders = lastNumbersOfOrders;
    }
}
