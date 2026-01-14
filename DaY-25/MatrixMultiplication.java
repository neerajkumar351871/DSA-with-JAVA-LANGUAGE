import java.util.Scanner;

public class MatrixMultiplication {

    // Function for matrix multiplication
    public static void multiplyMatrix(int[][] A, int[][] B,
                                       int r1, int c1, int c2) {

        int[][] C = new int[r1][c2];

        // Multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        System.out.println("Resultant matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r1, c1, r2, c2;

        // Input matrix sizes
        System.out.print("Enter rows and columns of first matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        // Check condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Function call
        multiplyMatrix(A, B, r1, c1, c2);

     
    }
}
