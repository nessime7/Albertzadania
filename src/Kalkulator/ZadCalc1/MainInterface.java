package Kalkulator.ZadCalc1;

/*
Stwórz jeden interfejs, który będzie się nazywał "Kalkulator" i będzie posiadał w sobie 5 metod,
czyli będzie add, subtract, multiply, divide, sqrt.
Stwórz dwie klasy RegularCalculator(); oraz ScientificCalculator(); które implementują interfejs kalkulator.
Zaimplementuj metody interfejsu zachowując zachowanie takie jak dotychczas dla RegularCalculator();
A z kolei ScientificCalculator(); ma robić to co RegularCalculator(); + ma obsługiwać pierwiastek
A w momencie kiedy wywołamy SQRT na RegularCalculator mamy dostać info że kalkulator nie wspiera takiej funkcjonalności.
Interfejs używtkownika na samym początku użytkownik wybiera czy ma działać na Regular czy Scientific.


Kalkulator
1. Normalny
2. Naukowy

1. -> 5 opcji ale jedna nie działa
2. -> 5 opcji


import java.util.Scanner;

public interface MainInterface {
    public void CalculatorMethod();
}

class Main {
    public static void main(String[] args) {
        Calculator myObj = new Calculator();
        myObj.CalculatorMethod();
    }
}

abstract class Calculator implements MainInterface {
    public class CalculatorMethod {
        public static void main(String[] args) {

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

        private static void calculate(Scanner scanner) {
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
}

 */