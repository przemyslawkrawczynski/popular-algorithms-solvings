package pl.pk.algorithms.patterns.observer;

public class ObserverMain {

    public static void main(String[] args) {


        ObservableValue observableValue = new ObservableValue();
        observableValue.addObserver((observable, o) -> System.out.println("Observator 1 - set new value " + o.toString()));
        observableValue.addObserver((observable, o) -> System.out.println("Observator 2 - set new value " + o.toString()));

        observableValue.sendValueToObserver(54);
    }
}
