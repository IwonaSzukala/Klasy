package Main;

public class SecondClass {
    public static void main(String[] args){
        double x = 2;
        double y = 4;
        double z = 8;

        double xsqrt = Math.sqrt(x); //pierwiastek liczby x
        double ysqrt = Math.sqrt(y); //pierwiastek liczby y
        double zsqrt = Math.sqrt(z); //pierwiastek liczby z

        double xypower = Math.pow(x, y); //liczba x podniesiona do potęgi y
        double xzpower = Math.pow(x, z); //liczba x podniesiona do potęgi z
        double zypower = Math.pow(z, y); //liczba z podniesiona do potęgi y

        System.out.println("Pierwiastek z liczby " + x + " wynosi " + xsqrt);
        System.out.println("Pierwiastek z liczby " + y + " wynosi " + ysqrt);
        System.out.println("Pierwiastek z liczby " + z + " w wynosi " + zsqrt);
        System.out.println("Liczba " + x + " podniesiona do potęgi " + y + " wynosi " + xypower);
        System.out.println("Liczba " + x + " podniesiona do potęgi " + z + " wynosi " + xzpower);
        System.out.println("Liczba " + z + " podniesiona do potęgi " + y + " wynosi " + zypower);

    }
}
