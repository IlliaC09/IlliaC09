// 5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 ... 7 5 3 1).

public class invMas {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) a++;
        }
        int[] Mas = new int[a];
        for (int i = 1, b = 0; i < 100; i++) {
            if (i % 2 != 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = Mas.length - 1; i >= 0; i--) {
            System.out.print(Mas[i] + " ");
        }
    }
}