
public class invertedstarPatternWithchar {

    public static void invertedstarPatternWithchar(int n) {
        char  A='A';
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Star
            for (int j = 1; j <= n - i; j++) {
                System.out.print(A+" ");
                A++;
            }
            // new line
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        invertedstarPatternWithchar(n);

    }
}
