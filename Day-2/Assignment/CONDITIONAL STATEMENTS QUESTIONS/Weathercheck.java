
import java.util.Scanner;

public class Weathercheck {

    public static void main(String args[]) {
        // Question1:Write aJava program toget anumber from the user and print whether it is positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to check the waether psositive or negative than enter");
        int number = sc.nextInt();
        System.out.println(number);
        if (number > 0) {
            System.out.println("Weather is  positive : " + number);
        } else {
            System.out.println("Weather is Negative : " + number);
        }

    }
}
