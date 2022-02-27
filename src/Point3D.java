//Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni dwuwymiarowej (współrzędne x oraz y).
// Zawierająca dwa konstruktory: bezparametrowy ustawiający pola na wartość 0, oraz przyjmujący dwa argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami.
//Napisz klasę Punkt3D dziedziczącą po Punkt2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z).
//W klasie testowej utwórz obiekty obu klas i przetestuj działanie.

class Point2D {
    int x;
    int y;

    public Point2D() {   //konstruktor 1
        x = 0;
        y = 0;
    }

    public Point2D(int a, int b) {  //konstruktor 2
        x = a;
        y = b;
    }
}

public class Point3D extends Point2D {
        int z;

    public Point3D(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }
}





