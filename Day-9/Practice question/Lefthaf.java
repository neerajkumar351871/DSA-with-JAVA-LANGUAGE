public  class  Lefthaf
{    public static void LefthalfPyramid(int n)
{
    for( int i=0;i<n;i++)
    {
        // Print space;
        for(int j=n-1;j>i;j--)
        {
            System.out.print(" ");
        }
         for(int k=0;k<=i;k++)
         {
         System.out.print("*");
  
         }
        System.out.println();

    }
}
    public static void main(String[] args) {
        LefthalfPyramid(4);
    }
}