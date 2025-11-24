
import java.util.Scanner;

public class Factorial {

    public static int Factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;// Calculate factorail
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Take a input with the help of Scanner class.
        int number = sc.nextInt();
        int result = Factorial(number);// Function call and store the value in result variable.
        System.out.println(number + " factorial is:" + result);
    }
}
