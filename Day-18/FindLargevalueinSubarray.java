public class FindLargevalueinSubarray {

    public static void Subarray(int array[]) {
        int max = Integer.MIN_VALUE;  

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum += array[k];
                }

                System.out.print("Sum:" + sum);

                // update overall max
                if (sum > max) {
                    max = sum;
                }

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Max value is: " + max);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        Subarray(array);
    }
}
