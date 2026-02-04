
public class SparseMatrix {

    public static boolean SparseMatrix(int matrix[][]) {
        int zero = 0;
        int NoneZero = 0;
        for (int ro = 0; ro < matrix.length; ro++) {
            for (int co = 0; co < matrix[0].length; co++) {
                if (matrix[ro][co] == 0) {
                    zero++;
                } else {
                    NoneZero++;
                }
            }

        }
        if (zero >= NoneZero) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {0, 5, 3},
            {0, 0, 2},
            {7, 0, 0}
        };
        if (SparseMatrix(matrix)) {
            System.out.println("Sparse matrix");
        } else {
            System.out.println(" Not Sparse matrix");

        }

    }
}
