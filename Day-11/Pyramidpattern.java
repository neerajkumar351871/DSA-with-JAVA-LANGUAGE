
public class Pyramidpattern {

    public static void Pyramidpattern(int n) {
        // outer loop 
        for (int i = 1; i <= n; i++) {
            // Space 
            for (int spc = 1; spc <= (n - i); spc++) {
                System.out.print(" ");
            }
            // Str
            for (int str = 1; str <= i; str++) {

                System.out.print(str);
            }
            for (int rest = i - 1; rest >= 1; rest--) {
                System.out.print(rest);
            }
            System.out.println("");
        }
        
    }

    public static void main(String[] args) {
        Pyramidpattern(5);

    }
}
