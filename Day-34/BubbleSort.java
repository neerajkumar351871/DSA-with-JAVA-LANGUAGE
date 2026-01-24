public class BubbleSort
{  
    public static void BubbleSort(int array[])
    {
        for(int turn =0; turn<array.length-1;turn++)
        {
          for(int j=0;j< array.length-1-turn;j++)
          {
              if(array[j]> array[j+1])
              {
                int temp=0;
                temp = array[j+1];
                array[j+1]= array[j];
                array[j]= temp;
              }
          }
        }
    }
     public  static  void  printarr(int arr[])
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
     }
    public static void main(String[] args) {
        int array[]={5,4,1,3,2};
        BubbleSort(array);
        printarr(array);
        
    }
}