
import java.util.*;

public class Weekname {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print(" If you want to check the  days  name than Enter the number 1-7:");
        int days = sc.nextInt();
        switch (days) {
            case 1: {
                System.err.println("Monday");
                break;
            }
            case 2: {
                System.out.print("Tuesday");
                break;
            }
            case 3: {
                System.out.print("Wednesday");
                break;
            }
            case 4: {
                System.out.print("Thursday");
                break;
            }
            case 5: {
                System.out.print("Friday");
                break;
            }
            case 6: {
                System.out.print("Saturday");
                break;
            }
            case 7: {
                System.out.print("Sunday");
                break;
            }
            default: {
                System.err.println("Day no is not exict");
            }
        }
    }
}
