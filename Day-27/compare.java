public class compare
{
    public static boolean compare(int array[])
    {
        // outer loop 
        for(int i=0;i<array.length;i++)
        {
            // check iteration
            for(int j=i+1;j<array.length;j++)
            {
                //compare
                if(array[i]==array[j])
                {
                    return true;
                }
            }
        }
        return false ;
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,2};
        boolean result;
        result=compare(array);
        if(result)
        {
            System.out.print("Duplicate value is avalible");
        }
        else
        {
          System.out.print("Duplicate value is not  avalible");  
        }
    }
}