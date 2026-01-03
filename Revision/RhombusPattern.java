
public class RhombusPattern {

    public static void RhombusPattern(int n) {
        int rows = n;

        // Outer loop
        for (int i = 0; i < rows; i++) {

            // First  spaces
            for (int spc = 0; spc < rows - i - 1; spc++) {
                System.out.print(" ");
            }

            // star
            for (int str = 0; str < rows; str++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) 
    {
        int n=5;
        RhombusPattern(n);
    }
}
