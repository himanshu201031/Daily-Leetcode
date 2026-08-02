package TwoPointers;

public class traprainwater {

public static int trap(int[] height) {
 int n = height.length;
 int ans = 0;
 int leftmax = 0;
 int rightmax = 0;

for (int i = 0; i < n; i++) {

    int leftMax = 0;
    int rightMax = 0;

    for (int j = 0; j <= i; j++) {
        leftMax = Math.max(leftMax, height[j]);
    }

    for (int j = i; j < n; j++) {
        rightMax = Math.max(rightMax, height[j]);
    }

    int water = Math.min(leftMax, rightMax) - height[i];
    ans += water;
}

return ans;
}





    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trap(height);
        System.out.println("Trapped water: " + trappedWater);

    }
}
