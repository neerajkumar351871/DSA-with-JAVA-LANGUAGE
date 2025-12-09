public  class RepetitiveNumberPattern
{  public static void RepetitiveNumberPattern(int n)
{
    int number=1;
    // outer loop
    for(int i=1;i<=n;i++)
    {
        // Inner loop 
        for(int j=1;j<=i;j++)
        {
            System.out.print(number+" ");
        }
        number++;
        System.out.println("");
    }
}
    public static void main(String[] args) {
        RepetitiveNumberPattern(5);
        
    }
}