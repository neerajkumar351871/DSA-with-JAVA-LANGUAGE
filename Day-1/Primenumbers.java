import java.util.*;
public class Primenumbers {

    public static boolean checkPrime(int number) {
        if (number <= 1)
         return false; // 0 and 1 are not prime

        // for (int i = 2; i <= number-1; i++)
         for (int i = 2; i <= Math.sqrt(number); i++)
         {
            if (number % i == 0) {
                return false; // divisible → not prime
            }
        }
        return true; // no divisor → prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int number = sc.nextInt();

        boolean result = checkPrime(number);

        if (result) {
            System.out.println("Number is prime: " + number);
        } else {
            System.out.println("Number is not prime: " + number);
        }
    }
}
