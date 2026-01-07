import java.util.Scanner;
public class Switch {

    public static int Switch(char a) {
        int flage = 0;
        switch (a) {

            case 'a': {
                flage = 1;
                break;
            }
            case 'e': {
                flage = 1;
                break;
            }
            case 'i': {
                flage = 1;
                break;
            }
            case 'u': {
                flage = 1;
                break;
            }
            case 'A': {
                flage = 1;
                break;
            }
            case 'E': {
                flage = 1;
                break;
            }
            case 'I': {
                flage = 1;
                break;
            }
            case 'O': {
                flage = 1;
                break;
            }
            case 'U': {
                flage = 1;
                break;
            }

            default:
                 return  flage;

        }
        return flage;
    }

    public static void main(String[] args) {
         Scanner  sc= new  Scanner(System.in);
         System.out.println("Enter the Chracter you want to check vowel or not:");
         char a = sc.next().charAt(0); 
         int result = Switch(a);
        if (result == 1) {
            System.out.println("Character is vowle:"+a);
        } else {
            System.out.println("Character is Not vowle:"+a);

        }
    }
}
