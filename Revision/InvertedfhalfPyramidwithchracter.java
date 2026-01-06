public class InvertedfhalfPyramidwithchracter
{
    public static void InvertedfhalfPyramidwithchracter(int n)
    {  // Outer loop
        for(int i=1;i<n;i++)
        {
            //Inner loop
            // Here chracter declare.
            char a= 'A';
            for(int chr=1;chr<=(n-i);chr++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println("");

        }
    }
    public static void main(String[] args) {
        InvertedfhalfPyramidwithchracter(5);
        
    }
}