//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

import java.util.Scanner;

public class Ameba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int x = scan.nextInt();
        int temp = 1;
        for (int i = 0; i < x / 3; i++) {
            temp *= 2;
        }
        System.out.println(x);
        System.out.println(temp);
    }

}
