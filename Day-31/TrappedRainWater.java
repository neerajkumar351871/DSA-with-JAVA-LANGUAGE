
public class TrappedRainWater {

    public static int TrappedRainWater(int height[]) {
        int n = height.length;
        // calculate left boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate  right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // calculate rain water
        int trappedRainWater = 0;
        for (int i = 0; i < n; i++) {
            ///WaterLevel = leftmax , rightmax;
              int waterLevel = Math.min(leftMax[i], rightmax[i]);
            // trapped rainwater (waterlevel- height)
            trappedRainWater += waterLevel - height[i];
        }
        return trappedRainWater;
    }

    public static void main(String[] args) {
        int array[] = {4, 2, 0, 6, 3, 2, 5};
        int result = TrappedRainWater(array);
        System.out.println("Trapped rain water :" + result);
    }
}
