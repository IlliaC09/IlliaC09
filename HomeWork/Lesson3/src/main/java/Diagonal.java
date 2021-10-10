import java.util.Random;

public class Diagonal {
    public static void main(String[] args) {
        Random random = new Random();

        int k = 3;
        int n = 3;
        int[][] array = new int[k][n];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(21);
                System.out.print((array[i][j] + " "));
                if (i == j) {
                    sum += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Diag sum: " + sum);
    }


}

