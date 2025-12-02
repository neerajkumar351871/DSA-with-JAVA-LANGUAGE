
public class DimondPatternCharacter {

    public static void DimondPattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop  / Space
            for (int spc = 0; spc < (n - i); spc++) {
                System.out.print(" ");
            }
            // Str
            // Chracter
            char A = 'A';
            for (int str = 1; str <= (i * 2) - 1; str++) {
                System.out.print(A);
                A++;
            }

            System.out.println("");
            // Reverse
        }
        for (int i = n; i >= 1; i--) {
            // inner loop  / Space
            for (int spc = 0; spc < (n - i); spc++) {
                System.out.print(" ");
            }
            // Chracter
            char A = 'A';
            for (int str = 1; str <= (i * 2) - 1; str++) {
                System.out.print(A );
                A++;
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {

        DimondPattern(4);
    }
}
