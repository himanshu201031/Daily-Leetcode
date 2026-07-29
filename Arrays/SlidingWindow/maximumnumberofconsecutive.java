package SlidingWindow;

public class maximumnumberofconsecutive {
    public static int maxlegth(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;

        int n = nums.length;
        for (int right = 0; right < n; right++) {

            if (nums[right] == 0)
                zeroCount++;

            if (zeroCount > k) {

                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            

        }

        return n - left;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        int rs = maxlegth(nums, k);
        System.out.println(rs);
    }
}
