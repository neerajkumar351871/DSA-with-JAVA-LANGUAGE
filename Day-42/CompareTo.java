
import java.util.regex.MatchResult;

public class CompareTo {

    public static void CompareToStr(String str, String strs) {
    
            System.out.println(str.compareTo(strs));
    

    }
 //  give the answer 0 string are  equal.
 // give the answer is -1 srt<fruString.
 // give the anser is 1 str> fruString.
 // This  function are caseSenstive.
    public static void main(String[] args) {
        String fru = "Neerajs";
        String fruString = "Neeraj";
        CompareToStr(fru,fruString);
    }
}
