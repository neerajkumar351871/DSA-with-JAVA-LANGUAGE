
public class Fullpuramidchar {

    public static void fullPyramid(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char A = 'A';
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(A);
                A++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        fullPyramid(4);
    }
}
