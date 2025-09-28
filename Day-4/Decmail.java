public class  Decmail
{
     public static void dectobin(int binumber) {
        int pow = 0;
        int Store = 0;
        while (binumber > 0) {
            // find the last digit
            int lastDigit = binumber % 2;
            Store = Store + (lastDigit * (int) Math.pow(10, pow));
            pow++;
            binumber = binumber / 2;

        }
        System.out.println(" Binary from is:" + Store);
    }

    public static void main(String args[]) {
      dectobin(4);
    }
}