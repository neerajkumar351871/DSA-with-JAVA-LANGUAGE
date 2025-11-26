public  class  Floud_s_Triangle
{
    public static void main(String[] args) {
        int n=4;
        int value=1;
        //Outer loop
        for(int i=1;i<=n;i++)
        {    // inner loop
            for(int j=1;j<=i;j++)
            {   // Print number with increment.
                 System.out.print(value+" ");
                 value++;
            }
            // Print new line.
            System.out.println("");
        }
    }
}