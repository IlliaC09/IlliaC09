import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Input {
    public static final String INPUT_FILE = "C:\\Users\\КОМП\\IdeaProjects\\IlliaC09\\HomeWork\\Lessons14\\src\\main\\resources\\hw1\\input.txt";
    public static final String OUTPUT_FILE = "C:\\Users\\КОМП\\IdeaProjects\\IlliaC09\\HomeWork\\Lessons14\\src\\main\\resources\\hw1\\output.txt";

    public static void main(String[] args) throws IOException {
        List<String> inputList = Files.readAllLines(Paths.get(INPUT_FILE));
        List<String> results = new ArrayList<>();
        for (String s : inputList) {
            System.out.println(String.format("String: \"%s\", is palindrom? : %s", s, isPalindrom(s)));
            if (isPalindrom(s)) {
                results.add(s);
            }
        }
        Path out = Paths.get(OUTPUT_FILE);
        Files.write(out, results, Charset.defaultCharset());
    }

    private static boolean isPalindrom(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }


}