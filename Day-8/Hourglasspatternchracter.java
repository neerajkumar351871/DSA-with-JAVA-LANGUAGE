
public class Hourglasspatternchracter {

    public static void Hourglasspatternchracter(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop for space
            for (int spc = 0; spc < i; spc++) {
                System.out.print(" ");
            }
            // Str
            // For stars chracter pattern
            char A='A';
            for (int str = 0; str <= (n - i); str++) {
                System.out.print(A+" ");
                A++;
            }
            System.out.println("");
        }
        // Reverse loop
        for (int i = n - 1; i > 0; i--) {
            // inner loop for space
            for (int spc = 0; spc < i; spc++) {
                System.out.print(" ");
            }
            // Str
            // For chracter 
            char A='A';
            for (int str = 0; str <= (n - i); str++) {
                System.out.print(A+" ");
                A++;
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Hourglasspatternchracter(5);

    }
}
