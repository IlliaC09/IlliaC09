import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Great1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");

        int number = sc.nextInt();
        int[] Array;
        Array = new int[number];
        for (int i = 0; i < number; i++) {
            Array[i] = (int) (random.nextInt(25));

        }
        System.out.println(Arrays.toString(Array));
    }
}

