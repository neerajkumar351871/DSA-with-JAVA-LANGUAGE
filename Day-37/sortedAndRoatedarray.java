
public class sortedAndRoatedarray {

    public static int sortedAndRoated(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {  //  Find mid value;
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] >= nums[end]) // Check  if left half is sorted
            {  // If target left half.
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } else// Right half is sorted.
            { // Check right half is sorted.
                if (mid + 1 <= end && target >= nums[mid + 1] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 3;
        int index = sortedAndRoated(array, key);
        if (index == 1) {
            System.out.println("YES OR VALUE:"+key+" INDEX :"+index);
        } else {
         System.out.println("NO OR VALUE:"+key+" INDEX :"+index);
        }

    }
}
