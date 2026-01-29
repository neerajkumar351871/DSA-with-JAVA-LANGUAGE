import java.util.Scanner;
public class TwoD_Matrix {
 public static void TwoD_Matrixd() {
        Scanner sc = new Scanner(System.in);
        char matrix[][] = new char[3][3];
        // Take input;
        System.out.print("Enter the character:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        // Print array.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter  the  chracter you want to Search:");
        char target = sc.next().charAt(0);
        // Function call.

        SearchChar(matrix, target);
    }

    public static void SearchChar(char matrix[][], char key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("FOUND OF CELL: "+"("+i+","+j+")");
                }
            }

        }
    }

    public static void main(String[] args) {
        TwoD_Matrixd();
    }
}
