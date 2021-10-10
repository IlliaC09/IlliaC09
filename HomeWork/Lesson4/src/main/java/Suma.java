// Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
// умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
public class Suma {

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int c = Summ(a, b);
        System.out.println("Результат = " + c);
    }

    /* метод */
    public static int Summ(int n1, int n2) {
        int temp = 0;
        for (int i = 0; i < n1; i++) {
            temp += n2;
        }
        return temp;
    }
}
