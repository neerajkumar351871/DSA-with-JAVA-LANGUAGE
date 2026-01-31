public class PositiveNegative {

    public static void PositiveNegative(int array[]) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            if (array[left] < 0) {
                left++;
            } 
            else if (array[right] > 0) {
                right--;
            } 
            else {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, -1, 4, -7, -9, -10};

        PositiveNegative(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
