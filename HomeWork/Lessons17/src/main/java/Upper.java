import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Upper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "arya", "sansa");

        names.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
    }
}