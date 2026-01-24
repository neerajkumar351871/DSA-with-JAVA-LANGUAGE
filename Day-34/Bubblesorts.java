public class Bubblesorts {

    // single pass bubble (descending)
    public static void bubble(int arr[]) {
        int count = 0;
              // This loop is work only ascending order
        for (int i = 0; i < arr.length - 1; i++) { // O(n)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }

        System.out.println("Swaps: " + count);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 2, 5, 4};
        bubble(array);
        printarr(array);
    }
}
