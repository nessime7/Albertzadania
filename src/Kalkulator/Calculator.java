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

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
        int x = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        boolean condition = true;
        int y = scanner.nextInt();
        while (condition) {
            System.out.println("Jakie działanie chcesz wykonać?\n" +
                    "+\n" +
                    "-\n" +
                    "*\n" +
                    "/\n");

            String choice = scanner.next();
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
            condition = false;
            System.exit(1);
        }
    }
}