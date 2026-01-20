
public class Min_Max_array {   // This program find the min or max element in array;

    public static void Min_Max_array(int array[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            //max=Math.max(array[i],max);
            //min =Math.min(array[i],min);
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Max element in array:" + max);
        System.out.println("Min element in array:" + min);
    }

    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        Min_Max_array(array);

    }
}
