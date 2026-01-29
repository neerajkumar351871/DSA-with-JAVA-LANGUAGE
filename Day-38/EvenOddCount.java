
public class EvenOddCount {

    public static void countoddEven(int array[]) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Total  Even number is :"+countEven);
        System.err.println("Total  Even number is :"+countOdd);
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        countoddEven(array);

    }
}
