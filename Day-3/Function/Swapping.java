
public class Swapping {

    public static void swapping(int a, int b) {
        int temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping"+"Value of A:"+a+",B:"+b);

    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping"+"Value of A:"+a+",B:"+b);
        swapping(a, b);
    }
}
