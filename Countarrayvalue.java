public class Countarrayvalue {

    public static int Countarrayvalue(int array[]) {
        int counter = 0;

        try {
            while (true) {
                int temp = array[counter]; //  
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // when index exceeds array size, exception occurs
        }

        return counter;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};

        int res = Countarrayvalue(array);
        System.out.println("Total Index is : " + res);
    }
}
