public class Insertion {

    public static void Insertion(int array[], int Index, int value) {

        // shift elements to the right
        for (int i = array.length - 1; i > Index; i--) {
            array[i] = array[i - 1];
        }

        // insert value
        array[Index] = value;

        // print array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int Index = 3;
        int value = 10;

        Insertion(array, Index, value);
    }
}
