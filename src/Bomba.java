//Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią. Następnie wyświetl na ekranie Odliczanie z tekstem
// "Bomba wybuchnie za ... " gdzie w miejsce dwukropka mają się pojawić liczby od podanej przez użytkownika do 0.
// Napisz program w 3 wersjach przy użyciu różnych pętli.

import java.util.Scanner;

class Bomba1 {
    public static void main(String[] args) {
        System.out.println("Uwaga bomba!");
        Scanner komunikat = new Scanner(System.in);
        int zegar;

        System.out.println("Wprowadź liczbę całkowitą nicponiu: ");
        zegar = komunikat.nextInt();

        while (zegar > 0) {
            System.out.println("Bomba wybuchnie za: " + zegar + " frajerze");
            zegar--;
        }

        System.out.println("BUM NIE ŻYJESZ MORDO");
    }
}

class Bomba2 {
    public static void main(String[] args) {
        System.out.println("Uwaga bomba!");
        Scanner komunikat = new Scanner(System.in);
        int zegar;

        System.out.println("Wprowadź liczbę całkowitą nicponiu: ");
        zegar = komunikat.nextInt();

        do {
            System.out.println("Bomba wybuchnie za: " + zegar + " frajerze");
            zegar--;
        }

        while (zegar > 0);
            System.out.println("Bomba wybuchnie za: " + zegar + " frajerze");
        System.out.println("BUM NIE ŻYJESZ MORDO");
    }
}

class Bomba3 {
    public static void main(String[] args) {
        System.out.println("Uwaga bomba!");
        Scanner komunikat = new Scanner(System.in);
        int zegar;

        System.out.println("Wprowadź liczbę całkowitą: ");
        for (zegar=komunikat.nextInt(); zegar>0; zegar--)
            System.out.println("Bomba wybuchnie za: " + zegar);
        System.out.println("BUMM SZAKA LAKA");
}
}

