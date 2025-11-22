public class ArrayQuestion
{
     public static void  arrangeArray (int array[])
    {
        for(int i=0;i<array.length;i++)
        {
         for(int j=i+1;j<array.length;j++)
         {
             if(array[i]>array[j])
             {
                 int  temp= array[j];
                 array[j]=array[i];
                 array[i]=temp;
             }
         }
        }
    }
    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;  // smallest possible number

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;  // smallest possible number

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
    public static void  main(String args[])
    { 
        int array[]={1,5,2,3,4,6,8,9};
        arrangeArray(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        //
        int result=findMax(array);
        System.out.println("Max value"+result);
        int minvalue=findMin(array);
        System.out.println("Min value"+minvalue);

        
        
    }
}