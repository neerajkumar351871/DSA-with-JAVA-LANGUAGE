import java.util.Arrays;
public  class InbuildSort
{
    public  static void printarry(int array[])
    {
        // for(int i=0;i<array.length;i++)
        // {
        // System.out.print(array[i]+" ");
        // }
        for(int i=array.length; i>0;i--)
        {
        System.out.print(array[i-1]+" ");
        }
    }
    public static void main(String[] args) {
        int array[]={5,4,1,3,2};
        Arrays.sort(array);
        printarry(array);
        
    }
}