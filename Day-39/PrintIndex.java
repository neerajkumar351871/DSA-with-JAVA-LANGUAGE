public class PrintIndex  {

    public static void printIndex(int matrix[][], int key) {
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at index: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Value not found: " + key);
        }
    }

    public static void main(String[] args) {
        int array[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };

        int key = 1;
        printIndex(array, key);
    }
}
