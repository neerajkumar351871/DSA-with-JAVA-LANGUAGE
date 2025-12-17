
public class BinarySearch {

    public static boolean BinarySearch(int array[], int key) {
        int Start = 0;
        int end = array.length - 1;
        while (Start <= end) {
            int mid = (Start + end) / 2;
            if (array[mid] == key) {
                return true;

            } else if (array[mid] > key) {
                end = mid - 1;
            } else if (array[mid] < key) {
                Start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 9;
        boolean res = BinarySearch(array, key);
        if (res) {
            System.out.println("Value is found:" + key);
        } else {
            System.out.println("Value is not found:" + key);
        }

    }
}
