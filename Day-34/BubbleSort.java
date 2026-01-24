public class BubbleSort
{  
    public static void BubbleSort(int array[])
    { 
         // Time complexity  is o(n)2
        for(int turn =0; turn<array.length-1;turn++)
        {  int count=0;    
          for(int j=0;j< array.length-1-turn;j++)
          {
              if(array[j]> array[j+1])
              {
                int temp=0;
                temp = array[j+1];
                array[j+1]= array[j];
                array[j]= temp;
                count++;
               
              }
          }  // count calculate number of swapping;
          System.out.print(count+" ");
        }
        System.out.println("");
        
    }
     public  static  void  printarr(int arr[])
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
     }
    public static void main(String[] args) {
       // int array[]={5,4,1,3,2};
        int array[]={1,2,3,4,5};
        BubbleSort(array);
        printarr(array);
        
    }
}