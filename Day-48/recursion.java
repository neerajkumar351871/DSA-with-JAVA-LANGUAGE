public class recursion
{
    public static void rec(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return ;
        }
        System.out.print(n+" ");
        rec(n-1);

    }
    public static void main(String args[])
    {
         int n=10;
         rec(n);
    }
}