
public class Binarytodecimal {

    public static void BinaryToDecimal(int n) {
        int sum = 0;
        int power = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            sum += lastdigit * Math.pow(2, power);
            power++;
            n /= 10;
        }

        System.out.println("Binary to Decimal: " + sum);
    }

    public static void main(String args[]) {
        BinaryToDecimal(1010);
    }
}
