package pl.pk.algorithms.patterns;

public class PatternsMain {

    public static void main(String[] args) {

        SingletonImplementation singleton = SingletonImplementation.getINSTANCE();
        SingletonImplementation singletonImplementation2 = SingletonImplementation.getINSTANCE();

        singleton.showDesc();
        System.out.println("It`s the same object? " + singleton.equals(singletonImplementation2));
    }
}
