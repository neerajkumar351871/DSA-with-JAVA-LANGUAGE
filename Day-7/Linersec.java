
public class Linersec {

    public static int linersec(int array[], int key) {
        for (int i = 0; i <array.length; i++) {
            if (array[i] == key) {
                return 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key =6;
        int finalSearch = linersec(array, key);
       
        if (finalSearch == -1) {
            System.out.println("Key is not found");

        } else {
            System.out.println("Key is found:"+key);

        }

    }
}
