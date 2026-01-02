public class Inverted_Roatedhalf_Pyramid
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            //Space
            for(int Space=1; Space<=(n-i);Space++)
            {
                System.out.print(" ");
            }
            //Star
            for(int str=1;str<=i;str++)
            {
                System.out.print("*");
            }
            //New Line;
            System.out.println("");
        }
    }
}
