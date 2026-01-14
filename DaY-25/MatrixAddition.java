
import java.util.Scanner;

public class MatrixAddition {

    public static void addMatrix(int[][] A, int[][] B, int r, int c) {

        int[][] C = new int[r][c];

        // Addition logic
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display result
        System.out.println("Resultant matrix (Addition):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Enter number of rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        addMatrix(A, B, r, c);
    }
}
