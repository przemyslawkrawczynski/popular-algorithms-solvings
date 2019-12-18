package pl.pk.algorithms.recursion.fibonacci;

public class FibonacciMain {

    public static void main(String[] args) {

        int n = 5000; // Recursive way StackOverFlow

        long timeIn1 = System.currentTimeMillis();
        System.out.println("No recursive way: " + fibonacciNoRecursion(n));
        System.out.println("Time to done this: " + (System.currentTimeMillis() - timeIn1));

        long timeIn2 = System.currentTimeMillis();
        System.out.println("\nRecursive way: " + fibonacciRecursion(n));
        System.out.println("Time to done this: " + (System.currentTimeMillis() - timeIn2));
    }

    private static long fibonacciNoRecursion(int n) {
        long znak1 = 1;
        long num2 = 0;
        long suma = 1;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                znak1 = num2;
                num2 = suma;
                suma = znak1 + num2;
            }
        }

        return suma;
    }

    private static long fibonacciRecursion(int n) {
        if(n<2) return 1;
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
}
