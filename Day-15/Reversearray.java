public class Reversearray

{  public static void Reversearray(int array[])
{
    int starting =0;
    int ending =array.length-1;
   while(starting<ending)
    {
        int temp =array[starting];
        array[starting]=array[ending];
        array[ending]=temp;
         starting++;
         ending--;
    }
    
}
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};
        Reversearray(array);
       for(int o=0;o<array.length;o++)
       {
        System.out.println(array[o]);
       }
    }
}