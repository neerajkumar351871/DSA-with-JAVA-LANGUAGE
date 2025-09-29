
import java.util.Scanner;

public class array {

    public static void main(String args[]) {
        /*String Fruits[]={"Mango","Grapes","Papaya"};
         for(int i=0;i<=Fruits.length;i++)
         {
            System.out.println(Fruits[i]);
         }*/

        // Take a input for user
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of phy:");
        marks[0] = sc.nextInt();
        System.out.print("Enter the marks of   math:");
        marks[1] = sc.nextInt();
        System.out.print("Enter the marks of Chem:");
        marks[2] = sc.nextInt();
        System.out.println(" Your phy marks is :" + marks[0]);
        System.out.println(" Your Math marks is :" + marks[1]);
        System.out.println(" Your  chem marks is :" + marks[2]);
        marks[2]=200;
    }
}
