public  class Clearithbit
{  public static int ClearbitIth(int n, int i)
     {
        int bitmask = (~(0)<<i);
         return  n & bitmask ;
     }
    public static void main(String[] args) {
            System.out.println( ClearbitIth(15, 2));

        
    }
}