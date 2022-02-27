package Kalkulator;

/*
Wprowadź pierwszą liczbę
Wybierz działanie:
"+"
"-"
"*"
"/"
Wprowadź drugą liczbę
 */

/*
Każda metoda zwraca wynik działania, który jest wypisywany w switchu.
 */

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę: ");
        int x = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        int y = scanner.nextInt();

        System.out.println("Wyniki z działań: \n" +
                "+\n" +
                "-\n" +
                "*\n" +
                "/\n");

        String choice = scanner.next();

        switch (choice) {
            case "+":
                int result = add(x, y);
                System.out.println(result);
                break;

            case "-":
                int result1 = subtract(x, y);
                System.out.println(result1);
                break;

            case "*":
                int result2 = multiplication(x, y);
                System.out.println(result2);
                break;

            case "/":
                int result3 = division(x, y);
                System.out.println(result3);
                break;
        }
    }

    private static int division(int x, int y) {
        return x / y;
    }

    private static int multiplication(int x, int y) {
        return x * y;
    }

    private static int subtract(int x, int y) {
        return x - y;
    }

    private static int add(int x, int y) {
        return x + y;
    }
}

