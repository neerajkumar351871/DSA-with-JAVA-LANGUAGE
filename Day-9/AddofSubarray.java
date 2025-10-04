public class AddofSubarray {

    public static void subarray(int array[]) {
        int ts = 0; // total subarrays count
        int totalsum = 0;
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                totalsum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " "); // Print subarray
                    totalsum += array[k];
                }
                System.out.println(" Sum is:"+totalsum);

                // update Max and Min correctly
                if (totalsum > Max) {
                    Max = totalsum;
                }
                if (totalsum < Min) {
                    Min = totalsum;
                }

                ts++; // increase count for each subarray
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total subarrays: " + ts);
        System.out.println("Maximum subarray sum: " + Max);
        System.out.println("Minimum subarray sum: " + Min);
    }

    public static void main(String arg[]) {
        int array[] = {2, 4, 6, 8, 10};
        subarray(array);
    }
}
