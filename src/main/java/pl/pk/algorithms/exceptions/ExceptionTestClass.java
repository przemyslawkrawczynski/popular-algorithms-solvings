package pl.pk.algorithms.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTestClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean error = true;
        do {
            try {
                System.out.println("Podaj liczbę: ");
                number = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.err.println("Nie podałeś liczby całkowitej spróbuj jeszcze raz.");
                sc.nextLine();
            } finally {
                sc.nextLine();
            }
        } while (error);
        System.out.println("Podałeś liczbę: " + number);

    }

}

