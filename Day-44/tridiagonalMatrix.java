
public class tridiagonalMatrix {

    public static void TridiagonalMatrix(int matrix[][]) 
    {
      for(int i=0;i<matrix.length;i++)
      {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(i==j || i+1==j|| j+1==i)
            {
                System.out.print(matrix[i][j]+" ");
            }
            else
            {
                System.out.print(0+" ");
            }
        }
        System.out.println();
      }
    }

    public static void main(String arg[]) {
        int matrix[][] = {
                         {1, 2, 3, 4}, 
                         {5, 6, 7, 8}, 
                         {4, 5, 6, 7}, 
                         {2, 4, 5, 6} 
                         };
        TridiagonalMatrix(matrix);
    }
}
