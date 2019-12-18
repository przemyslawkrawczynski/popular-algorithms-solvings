package pl.pk.algorithms.patterns.singleton;

import java.util.Random;

public class SingletonImplementation {

    private final String desc;
    private static SingletonImplementation INSTANCE = null;

    private SingletonImplementation() {
        Random r = new Random();
        this.desc = r.nextInt(1256) + "";
    }

    public static SingletonImplementation getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (SingletonImplementation.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonImplementation();
                }
            }
        }
        return INSTANCE;
    }

    public void showDesc() {
        System.out.println(desc);
    }

}
