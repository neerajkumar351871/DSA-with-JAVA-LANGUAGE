public class CountTotalsubarray {
  public static void countSubarray(int array[]) {
          int subCount=0;
          int subarray=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int val = i; val <= j; val++) {
                    System.out.print(array[val]+" ");
                    subarray++;
                }       
                subCount++;

                System.out.println("");
            }
            System.out.println("");
            }
            System.out.println("Total sub array : "+subCount);
            System.out.println("Total sub array Iteration : "+subarray);


    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        countSubarray(array);
    }
}
