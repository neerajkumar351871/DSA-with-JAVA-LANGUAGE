
public class UpperDiagonalMatrix {

    public static boolean UpperDiagonalMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j < i && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {0, 9, 4},
            {0, 0, 9}
        };
        if (UpperDiagonalMatrix(matrix)) {
            System.out.println(" UPPER DIAGONAL MATRIX ");
        } else {
            System.out.println(" NOT UPPER DIAGONAL MATRIX ");

        }
    }
}
