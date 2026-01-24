
public class StrongNumber {

    // Function to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Function to check strong number
    public static void checkStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong Number"); 
        }else {
            System.out.println(original + " is Not a Strong Number");
        }
    }

    public static void main(String[] args) {
        checkStrong(145);
    }
}
