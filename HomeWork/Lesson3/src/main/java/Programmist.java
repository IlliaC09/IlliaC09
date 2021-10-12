public class Programmist {
    public static void main(String[] args) {
        int[] array;
        array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i;
        }
        for (int i = 0; i < 1000; i++) {
            if (array[i] % 100 >= 11 && array[i] % 100 <= 14) {
                System.out.println(i + " Программистов");
            } else if (array[i] % 10 == 1) {
                System.out.println(i + " Программист");
            } else if (array[i] % 10 >= 2 && array[i] % 10 <= 4) {
                System.out.println(i + " Программиста");
            } else {
                System.out.println(i + " Программистов");
            }

        }

    }
}
