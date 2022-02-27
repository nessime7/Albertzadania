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

import java.util.Scanner;

public class Calculator1 {
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
                System.out.println(x + y);
                break;

            case "-":
                System.out.println(x - y);
                break;

            case "*":
                System.out.println(x * y);
                break;

            case "/":
                System.out.println(x / y);
                break;
        }
    }
}
