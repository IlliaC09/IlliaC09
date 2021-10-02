public class Sred {
    public static void main(String[] args) {
        int array[] = {1, 5, 10, 6, 8};
        double count;
        int sum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        count = (double) sum / n;
        System.out.println(count);
    }

}