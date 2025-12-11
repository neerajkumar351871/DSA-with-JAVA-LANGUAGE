public class Smallestvalueinarray
{  public static  int Smallestvalueinarray(int array[])
{
   int min=Integer.MAX_VALUE;
    for(int i=0;i<array.length;i++)
    {
        if(array[i]<min)
        {
            min=array[i];
        }
    }
   return min;
}
    public static void main(String[] args) {
         int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,34};
        int result = Smallestvalueinarray(array);
        System.out.println(" Smallest value is : " + result);
        
    }
}