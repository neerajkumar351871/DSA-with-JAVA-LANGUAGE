public class InvertedfhalfPyramidwithnumbers
{  public  static void InvertefhalfPyramidwithnumbers(int n)
{
    // Outer loop
    for(int i=0;i<n;i++)
    {   // Inner loop
        for(int num=1;num<=(n-i);num++)
        {
            System.out.print(num+" ");
        }
        System.out.println("");
    }
}
     public static void main(String[] args) {
        InvertefhalfPyramidwithnumbers(5);
         
     }
}