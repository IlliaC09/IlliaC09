// Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
// умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
public class Suma {

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int c = summ(a, b);
        String sign = "";
        if (a < 0 && b > 0) {
            sign = "-";
        }
        if (b < 0 && a > 0) {
            sign = "-";
        }
        System.out.println("Результат = " + sign + c);
    }

    /* метод */
    public static int summ(int n1, int n2) {
        int temp = 0;
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        for (int i = 0; i < n1; i++) {
            temp += n2;
        }
        return temp;
    }
}
