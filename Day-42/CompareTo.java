
import java.util.regex.MatchResult;

public class CompareTo {

    public static void CompareToStr(String fruString[]) {
        String largest = fruString[0];
        for (int i = 0; i < fruString.length; i++) {
            if (largest.compareTo(fruString[i]) < 0) {
                largest = fruString[i];
            }
        }
        System.out.println("Largest String:" + largest);

    }
    //  give the answer 0 string are  equal.
    // give the answer is -1 srt<fruString.
    // give the anser is 1 str> fruString.
    // This  function are caseSenstive.

    public static void main(String[] args) {
        String fruString[] = {"Apple", "Mango", "Grapes"};

        CompareToStr(fruString);
    }
}
