import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class TextFormatter {


    public static void changeString(String str) {

        int start = 4;
        int end = 11;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);
    }

    public static void changeIndex(String str) {
        char temp;
        char[] result = str.toCharArray();
        temp = result[0];
        result[0] = result[3];
        result[3] = temp;
        System.out.println(result);
    }

    public static void palindrome(String str) {
        String[] words = str.split(" ");
        String temp = "";
        for (int i = 0; i < words.length; i++) {
            temp = new StringBuilder(words[i]).reverse().toString();
            if (words[i].equals(temp)) {
                System.out.println(words[i] + " Palindrome");
            } else {
                System.out.println(words[i] + " Not palindrome");
            }

        }
    }

    public static boolean isPolindromes(String str) {
        String temp = "";
        String[] words = str.split(" ");
        for (int i = 0; i < str.length(); i++) {
            temp = new StringBuilder(words[i]).reverse().toString();
            if (words[i].equals(temp)) {
                return true;
            } else
                return false;
        }
        return true;
    }

    public static void wordSentence(String str) {
        String[] sentence = str.split("\\. ");
        String temp = "";
        for (int i = 0; i < sentence.length; i++) {
            temp = sentence[i];
            String[] words = temp.split(" ");
            if (isPolindromes(temp)) {
                System.out.println(sentence[i]);
            } else if (words.length >= 3 & words.length <= 5) {
                System.out.println(sentence[i]);
            }

        }

    }


}

