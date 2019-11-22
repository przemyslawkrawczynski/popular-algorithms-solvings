package pl.pk.algorithms.whatWeSeAfterCompilation.collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionsMain {

    public static void main(String[] args) {

        Set<MyObject> testSet = new HashSet<>();
        for (int i=0; i<10; i++) {
            testSet.add(new MyObject());
        }

        System.out.println("HashSet size: " + testSet.size());
    }

    private static class MyObject {
        String ob = "My";

        public MyObject() {
        }

        @Override
        public boolean equals(Object o) {
           return true;
        }


        @Override
        public int hashCode() {
            return 1;
        }
    }
}


