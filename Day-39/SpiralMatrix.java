
public class SpiralMatrix {

    public static void SpiralMatrix(int matrix[][]) {
        int startingrow = 0;
        int startcolumn = 0;
        int endRow = matrix.length - 1;
        int endcoln = matrix[0].length - 1;
        
        while (startingrow <= endRow && startcolumn <= endcoln) {

            //  let col=j;
            // Row-i;
            //  TOp Boundary; sc->ec
            for (int j = startcolumn; j <= endcoln; j++) {
                System.out.print(matrix[startcolumn][j] + " ");
            }
            // Right Boundary sr+1->er
            for (int i = startingrow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endcoln] + " ");
            }
            //Bottom  Boudary. ec-1->sc
            for (int j = endcoln - 1; j >= startingrow; j--) {
                if (startingrow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }
            //Left er-1->er+1;
            for (int i = endRow - 1; i >= startingrow + 1; i--) {
                if (startcolumn == endcoln) {
                    break;
                }
                System.out.print(matrix[i][startcolumn] + " ");

            }
            startingrow++;
            endRow--;
            startcolumn++;
            endcoln--;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][]
                = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16},};
     // Function call
     SpiralMatrix(matrix);
    }
}
