
public class Fullpyramid {

    public static void LefthalfPyramid(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        LefthalfPyramid(4);
    }
}
