public class TriangleC {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        array[0] = new int[4];
        array[1] = new int[3];
        array[2] = new int[2];
        array[3] = new int[1];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                System.out.print(" " + array[j][i]);
            }
            System.out.println();
        }
    }
}


