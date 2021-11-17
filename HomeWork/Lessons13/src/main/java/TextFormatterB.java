import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatterB {
    private TextFormatterB() {
    }


    public static void removeMiddleChars(String string) {
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            int middleIndex = string.length() / 2;
            if (words[i].length() % 2 == 0) {
                StringBuilder middle = new StringBuilder(string.substring(middleIndex - 1, middleIndex + 1));
                System.out.println(middle);
            } else {
                System.out.println("Слово с нечетным кол-вом символов");
            }
        }
    }

    public static void findWord() {
        String stringPattern = "[a-z]+";
        String text = "cab, ccab, cccab";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }

    public static void findJava() {
        String stringOriginal = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        String temp = "Java\\s+\\d{1,2}";
        Pattern pattern = Pattern.compile(temp);
        Matcher matcher = pattern.matcher(stringOriginal);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void middleOfString(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
            } else {
                System.out.println("Строка содержит нечётное количество символов.");
            }
        }
    }

    public static void findEnglishWord() {
        String str = "One two three раз два три one1 two2 123 ";
        str = str.replaceAll("[а-яА-Я\\d]", "");
        System.out.println(str);
    }

}





