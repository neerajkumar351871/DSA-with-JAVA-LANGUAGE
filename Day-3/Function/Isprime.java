
import java.util.Scanner;

public class Isprime {

    public static boolean IsPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {

                return false;

            }
        }
        return true;
    }

    public static void ISPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        boolean data = IsPrime(n);
        // if (data) {
        //     System.out.println(" This is prime:" + n);
        // } else {
        //     System.out.println(" This is Not  prime:" + n);
        // }
        ISPrime(n);
    }
}
