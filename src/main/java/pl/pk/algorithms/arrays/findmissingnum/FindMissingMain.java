package pl.pk.algorithms.arrays.findmissingnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindMissingMain {

    public static void main(String[] args) {

        int[] tab = {1, 2, 8, 4, 5};

        List<Integer> listFromArray = new ArrayList<>();

        for (int i = 0; i < tab.length; i++) {
            listFromArray.add(tab[i]);
        }

        Arrays.sort(tab);

        int rangeMin = tab[0];
        int rangeMax = tab[tab.length - 1];

        IntStream.rangeClosed(rangeMin, rangeMax)
                .filter(i -> !listFromArray.contains(i))
                .forEach(missing -> System.out.println("Missing : " + missing));
    }

}