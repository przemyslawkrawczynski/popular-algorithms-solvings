package pl.pk.algorithms.arrays.arrayInArray;

import java.util.ArrayList;
import java.util.List;

public class IntsService {

    public List<IntSets> getIntSetsList(int[] arrayToCompare, int[] arrayCompareWith) {

        List<IntSets> resultList = new ArrayList<>();
        int maxValue = arrayCompareWith.length - 1;

        for (int i = 0; i < arrayToCompare.length - maxValue; i++) {

            int[] previous = new int[arrayCompareWith.length];
            int startPos = i;

            for (int j = 0; j < arrayCompareWith.length; j++) {
                previous[j] = arrayToCompare[startPos];
                startPos++;
            }
            resultList.add(new IntSets(previous, i));
        }

        return resultList;
    }

    public boolean compareArrayToIntSetList(int[] compareArray, IntSets set) {
        boolean isTheSame = false;
        for (int i=0; i < compareArray.length; i++) {
            isTheSame = compareArray[i] == set.getInts()[i];
        }
        return isTheSame;
    }

}
