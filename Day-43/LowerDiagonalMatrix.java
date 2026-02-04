public class LowerDiagonalMatrix
{
 public static   boolean LowerDiagonalMatrix(int Matix[][])
 {   
    for(int i=0; i<Matix.length;i++)
    {
        for(int j=0;j<Matix[0].length;j++)
        {
            if(j>i && Matix[i][j]!=0)
            {
              return false;
            }
        }
    }
     return   true;
 }
public static void main(String[] args) {
     int matrix[][] = {
            {1, 0, 0},
            {0, 9, 0},
            {7, 0, 0}
        };
         if (LowerDiagonalMatrix(matrix)) {
            System.out.println(" LOWER DIAGONAL MATRIX ");
        } else {
            System.out.println(" NOT LOWER DIAGONAL MATRIX ");

        }

}
}