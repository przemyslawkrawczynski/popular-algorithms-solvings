package pl.pk.algorithms.numbers.reverseNumber;

import java.util.Arrays;

public class ReversNumberMain {

    private static int num = 654321;

    public static void main(String[] args) {

        int createdNum = 0;
        do {
            createdNum = num % 10;
            num = num / 10;

            System.out.println(createdNum);
        } while (num > 0);
    }
}
