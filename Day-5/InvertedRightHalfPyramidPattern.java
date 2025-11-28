
public class InvertedRightHalfPyramidPattern {

    public static void InvertedRightHalfPyramidPattern(int n) {
        int rows = n;

        // Outer loop to print all rows
        for (int i = 0; i < rows; i++) {

            // Inner loop to print the * in each row
            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int   row=5;
        InvertedRightHalfPyramidPattern(row);

    }
}
