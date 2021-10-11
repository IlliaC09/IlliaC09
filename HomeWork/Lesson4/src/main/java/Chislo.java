//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"


import java.util.Scanner;

public class Chislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Положительное");
            System.out.println((number + "").length());
        }
        if (number < 0) {
            System.out.println("Отрицательное");
            System.out.println((number + "").length() - 1);
        }
        if (number == 0) {
            System.out.println("не положительное и не отрицательное");
            System.out.println((number + "").length());
        }

    }
}