public class Numberpattern {
    public static void Numberpattern(int n) {
        int row = n;

        for (int i = 0; i < row; i++) {

            // space
            for (int spc = 1; spc <= (n - i - 1); spc++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int str = 1; str <= i + 1; str++) {
                System.out.print(str);
            }

            // decreasing numbers
            for (int bac = i; bac >= 1; bac--) {
                System.out.print(bac);
            }

            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Numberpattern(4);
    }
}
