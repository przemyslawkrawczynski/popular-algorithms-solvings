package pl.pk.algorithms.arrays.foundMinAndMaxPairValue;

import java.util.Objects;

public class Pair implements Comparable<Pair> {

    private int position;
    private int sum;
    private int first;
    private int second;

    public Pair(int position, int sum, int first, int second) {
        this.position = position;
        this.sum = sum;
        this.first = first;
        this.second = second;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair pair = (Pair) o;
        return getPosition() == pair.getPosition() &&
                getSum() == pair.getSum() &&
                getFirst() == pair.getFirst() &&
                getSecond() == pair.getSecond();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPosition());
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.compare(o.sum, this.sum);
    }
}
