package Main;

public class PetlaDoWhile {
    public static void main(String[] args) {

        String[] days = {"Poniedziałek", "Wtorek", "Sroda", "Czwartek", "Piątek", "Sobota", "Niedziela"};

        int index = 0;
        do {
            System.out.println(days[index]);
            index++;
        } while (index < days.length);
        }
    }

