import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Input2 {
    public static final String INPUT_FILE_PATH = "C:\\Users\\КОМП\\IdeaProjects\\IlliaC09\\HomeWork\\Lessons14\\src\\main\\resources\\hw2\\input.txt";
    public static final String OUTPUT_FILE_PATH = "C:\\Users\\КОМП\\IdeaProjects\\IlliaC09\\HomeWork\\Lessons14\\src\\main\\resources\\hw2\\output.txt";

    public static void main(String[] args) throws IOException {

        String stringFromFile = Files.readString(Paths.get(INPUT_FILE_PATH));
        List<String> allSentences = new ArrayList<>(Arrays.asList(stringFromFile.split("\\s*\\.\\s*")));
        List<String> results = new ArrayList<>();
        for (String sentence : allSentences) {
            boolean palindromeFound = false;
            List<String> words = Arrays.asList(sentence.split(" "));
            for (String word : words) {
                if (isPalindrome(word)) {
                    results.add(sentence);
                    System.out.println(String.format("sentence: %s - Подходит есть палиндром: %s", sentence, word));
                    palindromeFound = true;
                    break;
                }
            }
            if (palindromeFound) {
                continue;
            }
            if (words.size() >= 3 && words.size() <= 5) {
                results.add(sentence);
                System.out.println(String.format("sentence: %s - Подходит потому что длина от 3 до 5", sentence));
            } else {
                System.out.println(String.format("sentence: %s - Не подходит потому что длина не от 3 до 5", sentence));

            }
        }

        Path out = Paths.get(OUTPUT_FILE_PATH);
        Files.write(out, results, Charset.defaultCharset());
    }

    // method
    private static boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }
}