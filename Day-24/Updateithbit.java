
public class Updateithbit {

    public static int Clearbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int Set_Bit_(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int Updateithbit(int n, int i, int newbit) {
        // System.out.println(newbit&1);
        if ((newbit & 1 ) == 0) {
            return Clearbit(n, i);
        } else {
            return Set_Bit_(n, i);
        }
    }
     public static int ClearbitIth(int n, int i)
     {
        int bitmask = (~(0)<<i);
         return  n & bitmask ;
     }

    public static void main(String[] args) {
    
    // System.out.println(Updateithbit(10, 2,4));
    
    System.out.println( ClearbitIth(15, 2));
 
   //  System.out.println(((-1)<<2));
    }
}
