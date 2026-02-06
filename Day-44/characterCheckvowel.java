
import java.util.Scanner;

public class characterCheckvowel {

    public static boolean checkVowel(char var) {
        if (       var == 'a' || var == 'A'
                || var == 'e' || var == 'E'
                || var == 'i' || var == 'I'
                || var == 'o' || var == 'O'
                || var == 'u' || var == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the character vowel or not:");
        System.out.println("Enter the character:");
        char isVowel = sc.next().charAt(0);
        if(checkVowel(isVowel))
        {
         System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
       
    }
}
