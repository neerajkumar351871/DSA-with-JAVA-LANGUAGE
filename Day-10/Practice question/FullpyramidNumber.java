public class FullpyramidNumber {

    public static void fullPyramid(int n) {
        for (int i = 0; i < n; i++) {

            // print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print numbers
            int number = 1;
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(number);
                number++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        fullPyramid(4);
    }
}
