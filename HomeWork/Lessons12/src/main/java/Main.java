import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Main {
    public static void main(String[] args) {
        //  TextFormatter.changeString("London is the capital of Great Britain");
        //  TextFormatter.changeIndex("London");
        //  TextFormatter.palindrome("AFA AFAD Roooo ROROR wdd2d");
        TextFormatter.wordSentence("My name is Kate. My surname is Pavlova. I'm AFA seven. I live in Minsk. I go to school number 214. I'm in the first form. Master");
    }
}
