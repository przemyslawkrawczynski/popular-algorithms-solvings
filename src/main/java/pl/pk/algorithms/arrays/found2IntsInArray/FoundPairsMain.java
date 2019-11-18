package pl.pk.algorithms.arrays.found2IntsInArray;

//This program founds max and min sum of pair ints in array
// array [0, 5, 10, 5, 0, 15]
// min [0,5],[5,0]
// max [10,5] | [0,15] | [5,10]

import java.util.*;
import java.util.stream.Collectors;

public class FoundPairsMain {

    public static void main(String[] args) {

        int[] array = {0, 5, 10, 5, 0, 15};
        Pair[] pairArray = createPairsFromArray(array);
        Arrays.sort(pairArray);

        int maxValue = pairArray[0].getSum();
        int minValue = pairArray[pairArray.length - 1].getSum();

        List<Pair>[] resultList = getAllPairsMaxAndMin(pairArray, minValue, maxValue);

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue + "\n");

        System.out.println("Min value pairs:");
        resultList[0].forEach(p -> System.out.println("Pair {" + p.getFirst() + "," + p.getSecond() + "} | Sum: " + p.getSum()));

        System.out.println("\nMax value pairs:");
        resultList[1].forEach(p -> System.out.println("Pair {" + p.getFirst() + "," + p.getSecond() + "} | Sum: " + p.getSum()));
    }

    public static List<Pair>[] getAllPairsMaxAndMin(Pair[] pairs, int min, int max) {
        List[] resultArray = new List[2];
        List<Pair> minPairs = Arrays.stream(pairs).filter(p -> p.getSum() == min).collect(Collectors.toList());
        List<Pair> maxPairs = Arrays.stream(pairs).filter(p -> p.getSum() == max).collect(Collectors.toList());

        resultArray[0] = minPairs;
        resultArray[1] = maxPairs;

        return resultArray;
    }

    public static Pair[] createPairsFromArray(int[] array) {
        Pair[] pairs = new Pair[array.length - 1];
        for (int i=0; i < array.length-1; i++) {
            pairs[i] = (new Pair(i, (array[i] + array[i+1]), array[i], array[i+1]));
        }
        return pairs;
    }
}
