package pl.pk.algorithms.numbers.sumOfDigits;

public class SumDigitsMain {

    private static Integer number = 6589;

    public static void main(String[] args) {

        String chars = String.valueOf(number);
        int[] num = new int[chars.length()];

        for (int i = 0; i < chars.length(); i++) {
            num[i] = Integer.parseInt(chars.substring(i, i+1));
        }

        int result = 0;

        for (Integer digit : num) {
            result = result + digit;
        }


        System.out.println("Sum of digits in number [" + number + "] is " + result + ".");
    }


}
