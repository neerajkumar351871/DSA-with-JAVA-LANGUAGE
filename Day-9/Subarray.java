public class Subarray {

    public static void subarray(int array[]) {
        int ts = 0; // total subarrays count
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " "); // Print subarray
                }
                ts++; // increase count for each subarray
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String arg[]) {
        int array[] = {2, 4, 6, 8, 10};
        subarray(array);
    }
}
