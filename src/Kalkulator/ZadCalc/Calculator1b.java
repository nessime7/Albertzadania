package Kalkulator.ZadCalc;

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
Wyekstraktuj metody. Logika która jest w switchu, zrobić ją w metodzie aby poukładać kod.
 */

import java.util.Scanner;

public class Calculator1b {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Calc\n" +
                    "2. Exit\n");
            String choice1 = scanner.next();
            switch (choice1) {
                case "1":
                    calculate(scanner);
                    break;
                case "2":
                    exit();
                    break;
            }

        }
    }

    private void calculate(Scanner scanner) {
        System.out.println("Wprowadź pierwszą liczbę: ");
        int x = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        int y = scanner.nextInt();

        System.out.println("Działania: \n" +
                "+ " +
                "- " +
                "* " +
                "/ " +
                "exit ");

        String choice = scanner.next();

        switch (choice) {
            case "+":
                int result = add(x, y);
                System.out.println("Wynik: " + result);
                break;

            case "-":
                int result1 = subtract(x, y);
                System.out.println("Wynik: " + result1);
                break;

            case "*":
                int result2 = multiplication(x, y);
                System.out.println("Wynik: " + result2);
                break;

            case "/":
                int result3 = division(x, y);
                System.out.println("Wynik: " + result3);
                break;
        }
    }


    private void exit() {
        System.exit(0);
    }

    private int division(int x, int y) {
        return x / y;
    }

    private int multiplication(int x, int y) {
        return x * y;
    }

    private int subtract(int x, int y) {
        return x - y;
    }

    private int add(int x, int y) {
        return x + y;
    }
}