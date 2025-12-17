
public class SumofMatrix {

    static void addMatrix(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] sum = new int[rows][cols];

        // Adding matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Print result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int A[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int B[][] = {
            {7, 8, 9},
            {1, 2, 3}
        };

        
        addMatrix(A, B);
    }
}
