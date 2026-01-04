public  class HollowRhombus
{  public  static void HollowRhombus(int n)
{
    //Outer loop
    // i contain to be row 
    for(int i=1;i<=n;i++)
    {
         // print space
         for(int spc=1;spc<=(n-i);spc++)
         {
            System.out.print(" ");
         }
        // j contain to be row
        for(int j=1;j<=n;j++)
        {
            if(i==1||j==1 || i==n||j==n)
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
        HollowRhombus(5);
    }
}