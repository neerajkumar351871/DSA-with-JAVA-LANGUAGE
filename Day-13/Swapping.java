
public class Swapping {

    public static  void Swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
         System.out.println("After Swapping A:"+a +" "+"B:"+b);
    }

    public static void main(String[] args) {
        int a=10, b=20;
       System.out.println("Before Swapping A:"+a +" "+"B:"+b);
       Swapping(a, b);

    }
}
