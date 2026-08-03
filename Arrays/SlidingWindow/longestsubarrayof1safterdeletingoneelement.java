package SlidingWindow;

public class longestsubarrayof1safterdeletingoneelement {
     public static int longestSubarray(int[] nums) {

        int left = 0;
        int zeroCount = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            // Delete exactly one element
            ans = Math.max(ans, right - left);
        }

        return ans;
    }
    public static void main(String[] args) {
        int []nums = {1,1,0,1};
        int rs=longestSubarray(nums);
        System.out.println(rs);
    }
}
