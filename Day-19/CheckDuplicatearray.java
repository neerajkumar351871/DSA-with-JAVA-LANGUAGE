public class CheckDuplicatearray {

    public static boolean CheckDuplicatearray(int array[]) {
        // Outer loop
        for (int i = 0; i < array.length; i++) {
            // Inner loop
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate value is: " + array[i]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 1};

        boolean res = CheckDuplicatearray(array);

        if (res) {
            System.out.println("Array is duplicate");
        } else {
            System.out.println("Array is not duplicate");
        }
    }
}
