
public class PairsTargetvalue{

    public static void Pairsinarray(int array[], int target) {
        for (int i = 0; i < array.length; i++) {
            int targetvalue = 0;
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ") :");
                // Check target;
                targetvalue = array[i] + array[j];
                // System.out.println("Pairs value:"+targetvalue);
                if (targetvalue == target) {
                    System.out.println("Target value is find:" + "(" + array[i] + "," + array[j] + ") :");
                } else {
                    System.out.println("Target value is is not found:" + target);
                }
            }
            System.out.println("");

        }

    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        int Target = 10;
        Pairsinarray(array, Target);

    }
}
