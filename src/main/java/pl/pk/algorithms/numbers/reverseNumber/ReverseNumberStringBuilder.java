package pl.pk.algorithms.numbers.reverseNumber;

public class ReverseNumberStringBuilder {

    public static void main(String[] args) {

        int num = 65489;

        String numToReverse = new StringBuilder(String.valueOf(num)).reverse().toString();

        int resultNum = Integer.parseInt(numToReverse);

        System.out.println(resultNum);

    }
}
