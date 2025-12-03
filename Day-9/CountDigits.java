import java.util.*;

public class CountDigits {

 
    public static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            num = num / 10;  
            count++;        
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countDigits(num);

        System.out.println("Number of digits = " + result);
    }
}
