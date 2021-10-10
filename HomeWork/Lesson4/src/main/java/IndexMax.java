// 6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
// Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

import java.util.Arrays;

public class IndexMax {
    public static void main(String[] args) {
        int[] mas = new int[12];
        int maxNumber = -16;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 31) - 15;
            if (maxNumber <= mas[i]) {
                maxNumber = mas[i];
                maxIndex = i;
            }
        }

        System.out.println(Arrays.toString(mas));
        System.out.println("Максимальный : " + maxNumber);
        System.out.println("Индекс : " + maxIndex);
    }

}
