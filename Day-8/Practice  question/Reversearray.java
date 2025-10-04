
public class Reversearray {

    public static void reverse(int array[]) {
        int fistIndex = 0;// This value indicate the  starting  index;
        int lastindex = array.length - 1;//This value indicate the  starting  index;
        while (fistIndex < lastindex) // Condtion of loop
        {    // Reverse logic
            int temp = array[fistIndex];
            array[fistIndex] = array[lastindex];
            array[lastindex] = temp;
            fistIndex++;
            lastindex--;
        }

    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        reverse(array);
        // Print after apply the function of reverse array;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
