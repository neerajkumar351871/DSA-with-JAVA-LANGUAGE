public class FullPyramid
{   public  static void FullPyramid(int n)
{
    // Outer loop
    for(int i=1;i<=n;i++)
    {
       // Space
       for(int spc=1;spc<=(n-i);spc++)
       {
        System.out.print(" ");
       }
       for(int str=1;str<=i;str++)
       {
          System.out.print("* ");
       }
       System.out.println();
    }

}
    public static void main(String[] args) {
        FullPyramid(5);
    }
}