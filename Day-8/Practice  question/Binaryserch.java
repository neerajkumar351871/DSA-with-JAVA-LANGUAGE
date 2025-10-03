public  class  Binaryserch

{   public static int BinarySerch(int array[], int key)
{
    int  start=0;
     int end=array.length-1;
     while(start<=end)
     {
       // Mid value
        int  mid = (start+end)/2;
        if(array[mid]==key)
        {
         return  mid;
        }
        if(array[mid]<key)
        {
           start= mid+1;  // Right
        }
        else
        {
            end=mid-1;
        }
     }
     return  -1;
}
    public static  void main(String arg[])
    {
         int array[]={2,4,6,8,10,12,14};
         int key=8;
        System.out.print("Index for keys:"+BinarySerch(array, key));
    }
}