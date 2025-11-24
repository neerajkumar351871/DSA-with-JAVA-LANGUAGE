public  class Reverseaaray{

    public static void arrayreverse(int array[]) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int array[] = {2, 4, 6, 8, 10};
        arrayreverse(array);   
        System.out.println("\nReversed Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
