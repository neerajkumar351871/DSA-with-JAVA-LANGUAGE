
public class Binary {

    public static void bintodec(int binumber) {
        int pow = 0;
        int Store = 0;
        while (binumber > 0) {
            // find the last digit
            int lastDigit = binumber % 10;
            Store = Store + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binumber = binumber / 10;

        }
        System.out.println("Your  Decimal Number :" + Store);
    }

    public static void main(String args[]) {
        bintodec(101);
    }
}
