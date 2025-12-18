public class Deletion {

    public static void delete(int[] array, int index) {

        // shift elements to the left
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // print array after deletion
        System.out.println("Array after deletion:");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int index = 2;

        delete(array, index);
    }
}
