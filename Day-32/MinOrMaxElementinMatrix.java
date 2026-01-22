
import java.util.Scanner;

public class MinOrMaxElementinMatrix {

    public static void MinOrMax(int matrix[][]) {

        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        // Print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Find min or max elemnt;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                minElement = Math.min(matrix[i][j], minElement);
                maxElement = Math.max(matrix[i][j], maxElement);
            }

        }
        System.out.println("Max Element in array:" + maxElement);
        System.err.println("Min element i  array:" + minElement);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        // take input through user;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        MinOrMax(matrix);
    }
}
