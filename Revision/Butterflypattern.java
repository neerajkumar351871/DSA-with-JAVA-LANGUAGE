
public class Butterflypattern {

    public static void butterflypattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Str
            for (int str = 1; str <= i; str++) {
                System.out.print("*");
            }
            // space
            for (int spc = 1; spc <= 2 * (n - i); spc++) {
                System.out.print(" ");
            }
            // Str
            for (int str = 1; str <= i; str++) {
                System.out.print("*");

            }
            System.out.println("");
            
        }
            // Reverse loop
             // outer loop
           for (int i=n;i>=1;i--) 
        {
            // Str
            for (int str = 1; str <= i; str++) {
                System.out.print("*");
            }
            // space
            for (int spc = 1; spc <= 2 * (n - i); spc++) {
                System.out.print(" ");
            }
            // Str
            for (int str = 1; str <= i; str++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {

        butterflypattern(4);
    }
}
