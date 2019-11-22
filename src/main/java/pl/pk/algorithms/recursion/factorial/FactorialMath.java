package pl.pk.algorithms.recursion.factorial;

public class FactorialMath {

    private static int n = 15;

    public static void main(String[] args) {
        System.out.println("Factorial from " + n + " = " + factorialUsingRecursion(n));
    }

    private static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }
}


