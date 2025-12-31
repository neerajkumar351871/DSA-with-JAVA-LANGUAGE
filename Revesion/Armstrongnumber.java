
import java.util.*;

public class Armstrongnumber {

    // Function to check Armstrong number
    public static boolean isArmstrong(int n) {
        int original = n;
        int power = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            sum += Math.pow(lastdigit, power);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println("Armstrong Number"); 
        }else {
            System.out.println("Not Armstrong Number");
        }
    }
}
