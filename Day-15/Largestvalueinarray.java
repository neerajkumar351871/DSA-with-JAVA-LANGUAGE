
public class Largestvalueinarray {

    public static int Largestvalueinarray(int array[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,34};
        int result = Largestvalueinarray(array);
        System.out.println("Largest value is :" + result);
    }
}
