
public class BruteforceAlgo {

    public static void Subarray(int array[]) {
        // outer loop
        // Start =i
        // End =j;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int val = i; val <= j; val++) {
                    System.out.print(array[val] + " ");
                    sum += array[val];
                    max = Math.max(sum, max);

                }

                System.out.println("");

            }
            System.out.println("");

        }
        System.out.print("Max value :" + max);
    }

    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        Subarray(array);
    }
}
