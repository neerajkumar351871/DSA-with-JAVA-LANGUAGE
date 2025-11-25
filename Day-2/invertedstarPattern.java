
public class invertedstarPattern {

    public static void invertedstarPattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println("");
        }

    }
 public static void invertedstarPatternnmumber(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Star
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j+" ");
            }
            // new line
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        int n = 5;
        invertedstarPattern(n); 
        invertedstarPatternnmumber(n);

    }
}
