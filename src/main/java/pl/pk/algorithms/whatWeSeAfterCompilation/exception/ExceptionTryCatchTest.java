package pl.pk.algorithms.whatWeSeAfterCompilation.exception;

public class ExceptionTryCatchTest {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3};

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(tab[i]);
            }
        } finally {
            System.out.println("Sout something");
        }

    }
}
