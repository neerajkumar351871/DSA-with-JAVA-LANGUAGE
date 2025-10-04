
public class Pairs {

    public static void pariArray(int array[]) {
        int totalparis = 0;
        /*int n=array.length;
       totalparis=n*(n-1)/2;*/ //  This formula is used to find the total number of pairs.
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")" + " ");
                totalparis++;
                //This count without formula.    
            }
            System.err.println();
        }
        System.out.println("Total pair  is :" + totalparis);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        pariArray(array);
    }
}
// output  is 
/*
(4,6) (4,8) (4,10)
(6,8) (6,10)
(8,10)
 */
