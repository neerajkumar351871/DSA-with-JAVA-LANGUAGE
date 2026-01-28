
import java.util.Arrays;

public class InbuildSort {

    public static void printarry(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

    public static void main(String[] args) {
        int array[] = {5, 4, 1, 3, 2};
        //   Arrays.sort(array);
        Arrays.sort(array, 1, 4);
        printarry(array);

    }
}
