
public class Bubblesorts {
    // using single loop.

    public static void bubble(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
              int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        System.out.println(count);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 2, 5, 4};
        bubble(array);
        printarr(array);
    }
}
