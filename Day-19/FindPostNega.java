
public class FindPostNega // Find negative value and positive value in array
{

    public static void FindPostNega(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println("Positive:" + array[i]);
            } else {
                System.out.println("Negaitive:" + array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 7, 8, -9};
        FindPostNega(array);
    }
}
