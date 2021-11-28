import java.util.ArrayList;
import java.util.Random;

public class Numbers {

    public static void Numbers2() {
        ArrayList<Integer> AL = new ArrayList<Integer>();
        int number;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            number = random.nextInt() % 100;
            AL.add(number);
        }

        System.out.println("Array AL:");
        System.out.println(AL);
        AL.removeIf(n -> (n % 2 != 0));

        for (int i : AL) {
            System.out.print(i + " ");
        }

    }


}