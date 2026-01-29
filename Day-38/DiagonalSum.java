
public class DiagonalSum {

    public static int Diagonalsum(int matrix[][]) {
        // Time complexity
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Primary diagonal.
            sum += matrix[i][i];
            // Secondary diagonal.
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];

            }

        }
        return sum;
    }

    public static void main(String[] args) {
int matrix[][] = {{11, 22, 33,44}, {55, 66, 77, 78}, {99, 110, 111, 112}, {113, 114, 115, 116}}; 
  System.out.println("Diagonal sum:"+Diagonalsum(matrix)); 
    }
}
