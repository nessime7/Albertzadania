package ZadanieGatunek;

import java.util.ArrayList;
import java.util.List;

public class Gatunki {

    public static void main(String[] args) {
        Gatunek pies = new Gatunek("Wilk", "Sssak", 1, 1, "Przyjaciel człowieka.");
        pies.wypiszDane();

        Gatunek kot = new Gatunek("Kotowaty", "Ssak", 2, 2, "Uważa że człowiek mu słyży");
        kot.wypiszDane();

        Gatunek gołąb = new Gatunek("Srający", "Ptak", 3, 3, "Srają na ludzi");
        gołąb.wypiszDane();

        List<Gatunek> listaGatunków = new ArrayList<>();
        listaGatunków.add(pies);
        listaGatunków.add(kot);
        listaGatunków.add(gołąb);

        //Wypisać dane obiektu które są w liście
        for (Gatunek wypiszZListy:
             listaGatunków) {
            wypiszZListy.wypiszDane();
        }

        System.out.println(Gatunek.STATIC_VAR);
        System.out.println(kot.STATIC_VAR);
        System.out.println(pies.STATIC_VAR);

        System.out.println("\nOto klon psa");
        Gatunek klonPsa = pies.klonuj();
        klonPsa.wypiszDane();

    }
}

//                                z obiektu  klasy
//dostęp do pola i metody obiektu     X
//dostęp do pola i metody klasy       X      X