package pl.pk.algorithms.arrays.arrayInArray;

import java.util.Arrays;
import java.util.List;

public class IntSets {
    private int position;
    private int[] ints;

    public IntSets(int[]ints, int position) {
        this.ints = ints;
        this.position = position;
    }

    public int[] getInts() {
        return ints;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IntSets -> ");
        Arrays.stream(ints).forEach(l->  sb.append("[" + l + "]"));
        return sb.toString();
    }
}
