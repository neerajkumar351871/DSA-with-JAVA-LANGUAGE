public  class AverageofElement
{ 
    public static int average(int array[])
    {
       int averages=1;
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
         sum+=array[i];
         averages=sum/array.length;
         }
        
         return averages;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};
     System.out.println("Average:"+average(array));
    }
}