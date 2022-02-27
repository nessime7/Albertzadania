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
Każde działanie ma być wykonane w osobnej metodzie z której ma zostać zwrócona wartość.
 */

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę: ");
        int x = scanner.nextInt();
        System.out.println("Jakie działanie chcesz wykonać?\n" +
                "+\n" +
                "-\n" +
                "*\n" +
                "/\n");

        String choice = scanner.next();

        System.out.println("Wprowadź drugą liczbę: ");
        int y = scanner.nextInt();

        switch (choice) {
            case "+":
                dodawanie(x, y);
                break;

            case "-":
                odejmowanie(x, y);
                break;

            case "*":
                mnozenie(x, y);
                break;

            case "/":
                dzielenie(x, y);
                break;
        }
    }

    private static void dzielenie(int x, int y) {
        System.out.println(x / y);
    }

    private static void mnozenie(int x, int y) {
        System.out.println(x * y);
    }

    private static void odejmowanie(int x, int y) {
        System.out.println(x - y);
    }

    private static void dodawanie(int x, int y) {
        System.out.println(x + y);
    }
}

