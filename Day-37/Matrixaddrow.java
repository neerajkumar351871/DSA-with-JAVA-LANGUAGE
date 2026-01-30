public class Matrixaddrow {

    public static int valueSum(int matrix[][], int key) {
        int sum = 0;

        // validate key
        if (key < 0 || key >= matrix.length) {
            return -1; // invalid row
        }

        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[key][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int array[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };

        System.out.print(valueSum(array, 2));
    }
}
