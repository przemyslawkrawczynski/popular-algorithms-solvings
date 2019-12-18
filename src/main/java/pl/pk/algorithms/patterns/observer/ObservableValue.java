package pl.pk.algorithms.patterns.observer;

import java.util.Observable;

public class ObservableValue extends Observable {

    private int oldValue = 0;

    public void sendValueToObserver(int newValue) {
        if (oldValue != newValue) {
            super.setChanged();
            super.notifyObservers(newValue);
            oldValue = newValue;
        }
    }

}
