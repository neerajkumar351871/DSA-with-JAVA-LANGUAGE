
public class CountingSort {

    public static void CountingSort(int array[]) {  // Find  largest value.
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }
        int count[] = new int[largest + 1]; // include the value is Zero.
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
          
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 4, 1, 3, 2, 4, 3, 7};
        CountingSort(array);
        printarr(array);
    }
}
