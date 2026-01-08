public class TransposeMatrix {

    public static void Matrix(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.err.print(array[j][i] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int Matrix[][] = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        Matrix(Matrix);
    }
}
