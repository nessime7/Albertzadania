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
Jak program się odpali to dwie opcje: 1. calc 2. exit; po wciśnięciu 1. odpala się kalkulator.
Jak się kończy działanie to znowu dwie opcje.
 */

import java.util.Scanner;

public class Calculator6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Calc\n" +
                    "2. Exit\n");
            String choice1 = scanner.next();

            switch (choice1) {
                case "1":
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
                    break;
                case "2":
                    exit();
                    break;
            }

        }
    }


    private static void exit() {
        System.exit(0);
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