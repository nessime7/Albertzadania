import java.util.Scanner;

class Albert2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź cyfrę, podniesiemy do potęgi trzeciej: ");
        double a = scan.nextDouble();
        double b = 3;
        double c = Math.pow(a, b);
        System.out.println(c);
    }
}

