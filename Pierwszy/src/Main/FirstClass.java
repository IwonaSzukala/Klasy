package Main;

public class FirstClass {
    public static void main(String[] args){
        System.out.println("Hello World"); //wywołuje "Hello World"
        int first = 10;
        double second = 5;
        double sqrt = Math.sqrt(second); //pierwiastek kwadratowy liczby second
        double power = Math.pow(second, first); //liczba second podniesiona do potęgi first

        System.out.println("Pierwiastek z " + second + " wynosi " + sqrt);
        System.out.println("Liczba " + second + " podniesiona do potęgi " + first + " to " + power);

    }
}
