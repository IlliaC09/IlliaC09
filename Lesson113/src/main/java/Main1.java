public class Main1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 5555555555L;
        long c = a + b;
        if (c > Integer.MAX_VALUE) { c=-1;};
        System.out.println(c);

    }
}