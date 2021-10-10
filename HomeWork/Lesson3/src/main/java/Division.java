import java.util.Scanner;

public class Division {
    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        if ((number % 15 == 0)) {
            System.out.println("foobar");
        } else if ((number % 3 == 0)) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }

    }

}

