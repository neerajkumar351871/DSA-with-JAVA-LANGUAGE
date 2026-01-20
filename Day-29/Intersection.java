
public class Intersection {

    public static void Intersection(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5,7,8};
        int b[] = {3, 4, 5, 6, 7, 8};
        Intersection(a, b);
        int maxlength = 0;
        maxlength = Math.max(a.length, b.length);
        // System.out.println("Maz length "+maxlength);
        int minlength = 0;
        minlength = Math.min(a.length, b.length);
        // System.out.println("Min length:"+minlength);
        if (a.length == maxlength) {
            System.out.println(" Array of A length:" + a.length);
        } else {
            System.out.println(" Array of B length:" + b.length);

        }
    }
}
