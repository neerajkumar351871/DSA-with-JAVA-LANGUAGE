


public class Anagrams {

    public static boolean AnagramsString(String fiString, String SecString) {
        if (fiString.length() == SecString.length()) {
            fiString.equals(fiString);
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        String first = "race";
        String second = "race";
        if(AnagramsString(first, second))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("false");
        }

    }
}
