import java.util.*;

public class PalindromeNumber {

    public static boolean Palindromenumber(int number) {
        
        int temp = number;       // store original number
        int rev = 0;

        while (number > 0) {
            int digit = number % 10;     // extract last digit
            rev = rev * 10 + digit;      // add digit to reverse number
            number = number / 10;        // remove last digit
        }

        if (temp == rev) {               // compare original with reverse
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean result = Palindromenumber(num);

        if (result) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is not a Palindrome Number.");
        }
    }
}
