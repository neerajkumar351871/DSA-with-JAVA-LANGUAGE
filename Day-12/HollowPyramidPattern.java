public class HollowPyramidPattern {

    public static void printHollowPyramid(int rows) {

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {

            // First inner loop - print leading spaces
            for (int j = 0; j < 2 * (rows - i) - 1; j++) {
                System.out.print(" ");
            }

            // Second inner loop - print stars or inner spaces
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i || i == rows - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        printHollowPyramid(rows);
    }
}
