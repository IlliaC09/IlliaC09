//  9) Проверить, различны ли все элементы массива, если не различны
//    то вывести элемент повторяющийся Пример: {0,3,46,3,2,1,2}
//    Массив имеет повторяющиеся элементы 3, 2
//                                     Пример: {0,34,46,31,20,1,28}
//    Массив не имеет повторяющихся элементов

import java.util.Arrays;


public class ProverkaMasivov {
    public static void main(String[] args) {
        int[] mas = {0, 3, 46, 3, 2, 1, 2};
        int k = 0;
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i + 1; j < mas.length - 1; j++) {

                if (mas[i] == mas[j]) {
                    k++;
                    System.out.println("Повтор " + mas[j] + " " + k);
                }
            }
        }
        System.out.println(Arrays.toString(mas));

    }
}