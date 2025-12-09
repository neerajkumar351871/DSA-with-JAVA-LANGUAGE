
public class RepetitiveNumberPatternWithchracter {

    public static void RepetitiveNumberPatternWithchracter(int n) {
        char A = 'A';
        // Outer loop;
        for (int i = 1; i <= n; i++) {
            //  inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(A + " ");
            }
            A++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        RepetitiveNumberPatternWithchracter(5);

    }
}
