public  class SelectionSort
{ 
    public  static  void  SelectionSort(int array[])
    {
        for(int i=0;i<array.length-1;i++)
        {  int minpos=i;
            for(int j=i+1;j<array.length    ;j++)
            {
                if( array[minpos]>array[j])
                {
                     minpos=j;
                }
            }
            // swap
            int temp=0;
            temp= array[minpos];
            array[minpos]=array[i];
            array[i]=temp;
        }
    }
     public static void printarr(int arr[])
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
     }
  public static void main(String[] args) {
      int  array[]={5,4,1,3,2};
       SelectionSort(array);
       printarr(array);
  }
}