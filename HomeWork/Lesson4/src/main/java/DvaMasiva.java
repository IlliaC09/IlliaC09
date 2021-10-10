import java.util.Random;
import java.util.Scanner;

public class DvaMasiva {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Кол-во строк :");
        int k = sc.nextInt();
        System.out.println("Введите Кол-во столбцов :");
        int n = sc.nextInt();
        int[][] array = new int[k][n];
        int[][] array1 = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(21);
                System.out.print((array[i][j] + " "));
            }
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = array1[i][j];

                System.out.print((array1[i][j] + " "));
            }
            System.out.println();
        }
    }
}