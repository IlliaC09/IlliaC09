import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int number = sc.nextInt();
        if (number > 0) {
            number++;
        }
        ;
        if (number < 0) {
            number = number - 2;
        }
        ;
        if (number == 0) {
            number = 10;
        }
        ;

        System.out.println(number);
    }
}