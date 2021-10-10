import java.util.Arrays;
import java.util.Random;

/**
 * Шаги по реализации:
 * - Прочитать два int из консоли
 * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
 * - Заполнить массив случайными значениями (до 100)
 * - Вывести в консоль матрицу заданного размера, но:
 * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
 * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
 * - В противном случае выведите "*"
 * <p>
 * Example:
 * - Значения с консоли - 2 и 3
 * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
 * 6 11 123
 * 1 14 21
 * - Для этого значения вывод в консоли должен быть:
 * <p>
 * + * *
 * * - +
 * <p>
 * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
 */
public class ZamenaSimvolovMasiva {
    public static void main(String[] args) {
        Random random = new Random();
        int k = 3;
        int n = 3;
        int[][] array = new int[k][n];
        String[][] array1 = new String[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(22);
                System.out.print((array[i][j] + " "));
                if ((array[i][j] % 21 == 0)) {
                    array1[i][j] = "+";
                } else if ((array[i][j] % 3 == 0)) {
                    array1[i][j] = "+";
                } else if (array[i][j] % 7 == 0) {
                    array1[i][j] = "-";
                } else {
                    array1[i][j] = "*";
                }


            }
            System.out.println();
        }
        for (String[] strings : array1) {
            System.out.println(Arrays.toString(strings));
        }

    }


}
