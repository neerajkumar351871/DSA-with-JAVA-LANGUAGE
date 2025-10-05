public class Butterfly
{
    public static void butterfly(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // Star
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            // Space 2*(n-1)
            for(int sp=1;sp<=2*(n-i);sp++)
            {
                System.out.print(" ");
            }
            // Star
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
             System.out.println();
 
        }

         for(int i=n;i>=1;i--)
        {
            // Star
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            // Space 2*(n-1)
            for(int sp=1;sp<=2*(n-i);sp++)
            {
                System.out.print(" ");
            }
            // Star
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
             System.out.println();
 
        }
        
    }
   public static void main(String arg[])
   {
     butterfly(6);
   }
}