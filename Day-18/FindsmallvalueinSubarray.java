public class FindsmallvalueinSubarray {

    public static void Subarray(int array[]) {
        int min = Integer.MAX_VALUE;   // overall minimum

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum += array[k];
                }

                System.out.print("Sum:" + sum);

                // update overall min
                if (sum < min) {
                    min = sum;
                }

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Min value is: " + min);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        Subarray(array);
    }
}
