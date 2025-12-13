public class Subarray
{   
    public static void Subarray(int array[])
{
    // outer loop
    // Start =i
    // End =j;
    for(int i=0;i<array.length;i++)
    {
        for(int j=i+1;j<array.length;j++)
        {
           for(int val=i;val<=j;val++)
           {
            System.out.print(array[val]+" ");
           }
           System.out.println("");
        }
        System.out.println("");
    }
}
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        Subarray(array);
    }
}