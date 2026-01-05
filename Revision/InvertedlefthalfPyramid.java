public class InvertedlefthalfPyramid
{  public static void InvertedlefthalfPyramid(int n)
{
    for(int i=1;i<=n;i++)
    {
        // Space
        for(int spc=1; spc<=i-1;spc++)
        {

             System.out.print(" ");
        }
         // str
         for(int str=1;str<=n-i;str++)
         {
            System.out.print("*");
         }
         // New Line
         System.out.println("");
    }
}
    public static void main(String[] args) {
        int row=5;
        // function call.
        InvertedlefthalfPyramid(row);
        
    }
}

