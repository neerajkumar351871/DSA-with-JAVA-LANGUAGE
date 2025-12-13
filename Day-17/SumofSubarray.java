
public class SumofSubarray {

    public static void Subarray(int array[]) {
        // outer loop
        // Start =i
        // End =j;

        int totalSubarray = 0;
        int SumofSubarray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                SumofSubarray = 0;
                for (int val = i; val <= j; val++) {
                    System.out.print(array[val] + ",");
                    SumofSubarray += array[val];
                }
                totalSubarray++;
                System.out.print("Sum:" + SumofSubarray);
                System.out.println("");

            }
            System.out.println("");
        }
        System.out.println("Total sub array:" + totalSubarray);

    }

    public static void CountSubarrayWithFormula(int array[]) {
        int TotalSubArray;
        int n = array.length;
        TotalSubArray = n * (n + 1) / 2;
        System.out.println("Total sub array:" + TotalSubArray);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10,};
        Subarray(array);
    }
}
