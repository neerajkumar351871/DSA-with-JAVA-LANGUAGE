public  class Solution {
    public static  int reverse(int number) {
     int rev = 0;
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number = -number;
        }

        while (number > 0) {
            int lastdigit = number % 10;
            rev = rev * 10 + lastdigit;
            number = number / 10;
        }

        if (isNegative) {
            rev = -rev;
        }

        return rev;
}


public static void main(String[] args)
{
  System.out.println(reverse(-789));
}
}