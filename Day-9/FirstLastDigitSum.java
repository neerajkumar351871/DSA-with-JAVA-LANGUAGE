
import java.util.*;

public class FirstLastDigitSum {

    public static int sumFirstLast(int num) {

        int last = num % 10;

        int first = num;

        while (first >= 10) {
            first = first / 10;
        }

        return first + last;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int result = sumFirstLast(num);

        System.out.println("Sum of first and last digit = " + result);
    }
}
