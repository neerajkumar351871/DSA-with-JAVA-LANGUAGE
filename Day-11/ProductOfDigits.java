
import java.util.*;

public class ProductOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int n = num;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }

        System.out.println("Product of digits of " + num + " = " + product);
    }
}
