
import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Check the number id leapyear or not : ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.print("Year is leapyear:" + number);
        } else {
            System.err.println("Year is not leapyear :" + number);
        }
    }
}
