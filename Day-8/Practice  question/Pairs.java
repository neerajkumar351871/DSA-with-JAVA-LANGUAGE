public class Pairs
{
    public static void pariArray(int array[])
    {
          for(int i=0;i<array.length;i++)
          {
            for(int j=i+1;j<array.length;j++)
            {
                 System.out.print("("+array[i]+","+array[j]+")"+" ");
            }
            System.err.println();
          }
    }
    public static void main(String[] args) {
       int array[]={2,4,6,8,10};
    pariArray(array);
    }
}
// output  is 
/*
(4,6) (4,8) (4,10)
(6,8) (6,10)
(8,10)
*/