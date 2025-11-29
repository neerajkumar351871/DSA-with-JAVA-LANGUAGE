public class InvertedFullPyramidPattern
{
    public static void InvertedFullPyramidPattern(int row)
    {
        // Outer loop 
        for (int i = 1; i <= row; i++)
        {

            //  spaces
            for (int spc = 1; spc<=(2 * i); spc++)
            {
                System.out.print(" ");
            }

            //  str *
            for (int str = 1; str <= (2 * (row - i) - 1); str++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int n = 5;
        InvertedFullPyramidPattern(n);
    }
}
