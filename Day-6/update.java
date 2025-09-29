public class  update
{     public static  void  updatetion( int array[], int value)
{    
     value=30;   
    for(int i=0;i<=array.length;i++)
    {
        array[i]+=1;
         System.out.println(array[i]);
    }
     System.out.println(value);
    
}
     public static void main(String  args[])
     {
         int array[]={1,2,3};
         int  value=9;
         updatetion(array,value);
     }
}