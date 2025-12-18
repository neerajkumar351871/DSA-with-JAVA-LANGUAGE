public class Updation {

    public static void update(int[] array, int index, int newValue) {

        // update value at given index
        array[index] = newValue;

        // print updated array
        System.out.println("Array after updation:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int index = 2;      // index to update
        int newValue = 99;  // new value

        update(array, index, newValue);
    }
}
