import java.util.Arrays;
import java.util.Collections;
public class DescendingOrderInbuildF
{  
    public static void printarry(Integer array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer array[]={4,5,1,3,2};
     Arrays.sort(array, Collections.reverseOrder());
     printarry(array); 

    }
}