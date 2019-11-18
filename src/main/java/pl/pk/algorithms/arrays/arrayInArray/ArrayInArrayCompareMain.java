package pl.pk.algorithms.arrays.arrayInArray;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayInArrayCompareMain {

    public static void main(String[] args) {

        int[] a1 = {1, 4, 6, 3, 7, 9, 1, 4};
        int[] a2 = {1, 4};

        IntsService intsService = new IntsService();

        List<IntSets> allSets = intsService.getIntSetsList(a1, a2);
        List<IntSets> resultList = allSets.stream().
                filter(intSets -> intsService.compareArrayToIntSetList(a2, intSets))
                .collect(Collectors.toList());

        IntSets result = resultList.get(resultList.size() - 1);

        System.out.println("The last mached value is on position: " + result.getPosition());
    }
}
