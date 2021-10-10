import java.util.Arrays;
import java.util.Random;

public class Calculator {
    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(30);
        }
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 1) {
                count++;
            }
            ;

        }

        System.out.println(Arrays.toString(Array));
        System.out.println(count);
    }

}