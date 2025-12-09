
public class SwappingWithTwoVaraible {

    public static void SwappingWithTwoVaraible(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swappig A:" + a + " " + "B:" + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swappig A:" + a + " " + "B:" + b);
        SwappingWithTwoVaraible(a, b);
    }
}
