
import java.util.Scanner;

public class Reversenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversenumber = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            reversenumber = reversenumber * 10 + lastdigit;
            number /= 10;
        }

        System.out.println("Reverse number is : " + reversenumber);
    }
}

