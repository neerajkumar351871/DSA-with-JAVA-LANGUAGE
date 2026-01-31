public class SearchMatrix
{
    public static boolean  searchMatrix(int[][] matrix, int target) 
    {

       int  r=0, c=matrix[0].length-1;
     while(r<matrix.length && c>=0)
     {
        if(matrix[r][c]==target)
        {
        return true;
        }
        else if(matrix[r][c]<target)
        {
            r++;
        }
        else
        {
            c--;
        }
     }
     return  false; 
    }
    public static void main(String[] args) {
        int Matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12,13}};
        int key=110;
         boolean res=searchMatrix(Matrix, key);
         if(res)
         System.out.print("VALUE IS FIND IN MATRIX:"+key);
        else
        System.out.print("VALUE IS NOT FIND IN MATRIX:"+key);

        
    }
}