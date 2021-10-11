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
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30 - 25);
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }

}
