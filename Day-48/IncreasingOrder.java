public class IncreasingOrder
{   
    public static void printInc(int n)
    {  int table=2;
        if(n==1)
        {
            System.out.println(table+" X "+(n)+"="+(n*table)+" ");
            return ;
        }
        printInc(n-1);
        System.out.println(table+" X "+(n)+"="+(n*table)+" ");
    }
    public static void main(String args[])
    {
       printInc(10);
    }

}