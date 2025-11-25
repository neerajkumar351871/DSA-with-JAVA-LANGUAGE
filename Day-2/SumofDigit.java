
import java.util.Scanner;

public class SumofDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int Storevalue = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            Storevalue += lastdigit;
            number /= 10;
        }

        System.out.println("Addation of digit to give the number:"+ Storevalue);
    }
}
