public class PalindromeArray {

    public static boolean PalindromeArray(int array[]) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false;   // not a palindrome
            }
            start++;
            end--;
        }
        return true; // all elements matched
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 2, 1,8};
        boolean res = PalindromeArray(array);

        if (res) {
            System.out.println("Palindrome Array");
        } else {
            System.out.println("Not a Palindrome Array");
        }
    }
}
