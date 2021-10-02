public class MaxMasiv {
    public static void main(String[] args) {
        int array[] = {1, 5, 19, 6, 8};
        int n = array.length;
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] > temp) {
                temp = array[i];
            }
        }
        System.out.println(temp);
    }
}
