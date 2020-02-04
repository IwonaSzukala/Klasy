package Main;

public class PetlaWhile {
    public static void main(String[] args) {

        String[] days = {"Poniedziałek", "Wtorek", "Sroda", "Czwartek", "Piątek", "Sobota", "Niedziela"};

        int index = 0;
        while (index < days.length) {
            System.out.println(days[index]);
            index++;
        }
    }

}
