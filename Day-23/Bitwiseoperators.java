public class Bitwiseoperators {

    public static void ANDOperator() {
        System.out.println("Bitwise  AND operator :"+(5&4));
       
    }
    public static void ORoperator()
    {
        System.out.println("Bitwise OR Operator :"+(5|6));
    }
     public static void XORoperator()
    {
        System.out.println("Bitwise XOR Operator :"+(5^6));
    }
    public static void BitwiseComplement()
    {
    System.out.println("Bitwise  one's complement Operator :"+(~5));
   }
    public static void BitwiseLeftShift()
    {
    System.out.println("Bitwise  one's Left shift :"+(5<<2));
   }
    public static void BitwiseRightShift()
    {
    System.out.println("Bitwise  one's Left shift :"+(6>>2));
   }

    public static void main(String[] args) {
        // ANDOperator();
        // ORoperator();
        // XORoperator();
        // BitwiseComplement();
        //BitwiseLeftShift();
        BitwiseRightShift();
    
       
    }
}
