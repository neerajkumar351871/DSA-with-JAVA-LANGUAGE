
import java.util.Scanner;

public class Create_2_Matrix {

    public static boolean Searchvalue(int matrix[][], int search) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == search) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Print 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.err.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        int ser = 4;
        if (Searchvalue(matrix, ser)) {
            System.out.println("Valu is founf:" + ser);
        } else {
            System.out.println("Value is not found");
        }

    }
}
