package Main;

public class PetlaFor {
    public static void main(String[] args) {
        String[] days = {"Poniedziałek", "Wtorek", "Sroda", "Czwartek", "Piątek", "Sobota", "Niedziela"};

        // 1
        for (int index = 0; index < days.length; index++) {
            System.out.println(days[index]);
        }

        //2
        int index = 0;
        for (; ; ) {
            if (index < days.length) {
                System.out.println(days[index]);
                index++;
            } else {
                break;
            }
        }
    }
}

/*
    for (String day: days) {
        System.out.println(day);
    }
*/