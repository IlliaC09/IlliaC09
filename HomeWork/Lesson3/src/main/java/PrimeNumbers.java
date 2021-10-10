/**
 * Задача со звездочкой!
 * Метод должен печатать все простые числа <1000
 * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
 */
class PrimeNumbers {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 1000; i++) {
            int delitel = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    delitel++;
                }
            }
            if (delitel == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}