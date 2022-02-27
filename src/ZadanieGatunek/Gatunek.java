package ZadanieGatunek;

public class Gatunek {

    public static String STATIC_VAR = "bedzie wiele pol";

    String rodzaj;
    String gatunek;
    int liczbaChromosomów2n;
    int podstawowaLiczbaChromosomów;
    String opis;

    public Gatunek() {

    }


    // Podaj pełną nazwę (rodzaj + gatunek)
    public String podajPelnaNazwe() {
        return rodzaj + " " + gatunek;
    }

    //Podaj haploidalną liczbę chromosomów n
    public int podajHaploidalnaLiczbeCh0romosomown() {
        return liczbaChromosomów2n / 2;
    }

    // Wypisz wszystkie dane
    public void wypiszDane() {
        System.out.println("Rodzaj: " + rodzaj);
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Liczba chromosomów: " + liczbaChromosomów2n);
        System.out.println("Podstawowa liczba chromosomów: " + podstawowaLiczbaChromosomów);
        System.out.println("Opis: " + opis);
    }

    public Gatunek(String rodzaj, String gatunek, int liczbaChromosomów2n, int podstawowaLiczbaChromosomów, String opis) {
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.liczbaChromosomów2n = liczbaChromosomów2n;
        this.podstawowaLiczbaChromosomów = podstawowaLiczbaChromosomów;
        this.opis = opis;
    }

    //klonującą obiekt – metoda powinna zwracać odnośnik do nowego obiektu typu Gatunek o wartościach pól takich samych jak w obiekcie, w którym została wywołana.
    public Gatunek klonuj() {
        Gatunek klon = new Gatunek();
        klon.rodzaj = rodzaj;
        klon.gatunek = gatunek;
        klon.liczbaChromosomów2n = liczbaChromosomów2n;
        klon.podstawowaLiczbaChromosomów = podstawowaLiczbaChromosomów;
        klon.opis = opis;
        return klon;
    }
}



