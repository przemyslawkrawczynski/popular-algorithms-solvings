package pl.pk.algorithms.numbers.fizzBuzz;

public class FizzBuzzMain {

    public static void main(String[] args) {

        int range = 100;

        for (int i = 0; i < range; i++ ) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println(i + " | " + "FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " | " + "Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " | " + "Buzz");
            }
        }
    }

}
