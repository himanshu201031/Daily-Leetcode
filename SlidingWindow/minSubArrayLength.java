package SlidingWindow;

class Solution {
    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int target = 7;int [] nums ={2,3,1,2,4,3};
        int rs=minSubArrayLen(target, nums);
        System.out.print(rs);
    }
}
