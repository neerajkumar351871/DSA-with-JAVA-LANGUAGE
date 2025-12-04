public  class HollowRectanglepattern
{  public  static  void HollowRectanglepattern(int row, int column)
{
    // Outer loop
    // i== row
    for(int i=1;i<=row;i++)
    {
        // inner loop
        // j=column.
        for(int j=1;j<=column;j++)
        {
            if(i==1||j==1 || i==row||j==column)
            {
                System.out.print("*");
            }
            else
            {   // print space.
                System.out.print(" ");
            }
      
        }
        System.out.println("");
          
    }
}
    public static void main(String[] args) {
        HollowRectanglepattern(4, 5);
        
    }
}