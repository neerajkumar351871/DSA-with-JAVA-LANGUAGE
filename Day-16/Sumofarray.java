public class Sumofarray
{ public static int Sumofarray(int array[])
{
    int sum=0;
    for(int i=0;i<array.length;i++)
    {
        sum+=array[i];
    }
    return  sum;
}
    public static void main(String[] args) {
        int  array[]={2,4};
         int result=Sumofarray(array);
         System.out.println("Sum of array:"+result);

    }
}