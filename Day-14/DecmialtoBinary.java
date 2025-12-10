
public class DecmialtoBinary {

    public static void BinaryToDecimal(int n) {
        int sum = 0;
        int power = 0;

        while (n > 0) {
            int lastdigit = n % 2;
            sum += lastdigit * Math.pow(10, power);
            power++;
            n /=2;
        }

        System.out.println("Binary to Decimal: " + sum);
    }

    public static void main(String args[]) {
        BinaryToDecimal(10);
    }
}
