//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2}
//        и поменять его местами с нулевым элементом

import java.util.Arrays;

public class MaxNa0 {
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
        int temp = 0;
        System.out.println(Arrays.toString(mas));
        System.out.println("Максимальный : " + maxNumber);
        System.out.println("Индекс : " + maxIndex);
        temp = mas[0];
        mas[0] = maxNumber;
        mas[maxIndex] = temp;

        System.out.println(Arrays.toString(mas));
    }

}

