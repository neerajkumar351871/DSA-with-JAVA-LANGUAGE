public class Transposematrix
{  public static  void Transposematrix(int matrix[][])
{
    for(int r=0;r<matrix.length-1;r++)
    {
        for(int c=r+1;c<matrix[0].length;c++)
        {  // 
            int temp= matrix[r][c];
             matrix[r][c]=matrix[c][r];
             matrix[c][r]=temp;
        }
    }
}
public static void printMatrix(int matrix[][]) {
    for (int i = 0; i < matrix.length; i++) {          
        for (int j = 0; j < matrix[0].length; j++) {   
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(); 
    }
}

    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{50,60,70,80},{90,10,110,120},{130,140,150,160}};
        printMatrix(matrix);
        Transposematrix(matrix);
        System.out.println(" ");
        printMatrix(matrix);
        
    }
}