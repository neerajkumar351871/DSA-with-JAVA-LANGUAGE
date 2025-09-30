public class Max {
    public static void maxInArray(int array[]) {
        int maxNumber = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("Largest value is:" + maxNumber);
    }
     public static void minInArray(int array[]) {
        int minNumber = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] <minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("Smallest value is:"+ minNumber);
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 6, 5};
        maxInArray(array);
        minInArray(array);
    }
}
