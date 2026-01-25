
public class Diagonalsum {

    public static int Diagonalsum(int matrix[][]) {
       // Time complexity
       int sum=0;
    // for(int i=0;i<matrix.length;i++)
    // {
    //    for(int j=0;j<matrix.length;j++)
    //    {
    //       if(i==j) // Primary diagonal
    //       {
    //         sum+=matrix[i][j];
    //       }
    //       else if(i+j== matrix.length-1) // Secondary diagonal
    //       {
    //         sum+= matrix[i][j];
    //       }
    //    }
    // }
          
     for(int i=0;i<matrix.length;i++)
     {
      // Primary diagonal.
      sum+=matrix[i][i];
      // Secondary diagonal.
      if(i != matrix.length-1-i)
      {
      sum+=matrix[i][matrix.length-1-i];

      }

     }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Diagonalsum(matrix));
    }
}
