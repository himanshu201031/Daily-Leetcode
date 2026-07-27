public class MaximumSumSubarrayofSizeK {
    public static int getmax(int arr[], int k) {
        int st = 0;
        int sum = 0, maxsum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int end = 0; end < n; end++) {
            sum = sum + arr[end];
            if (end >= k - 1) {
                maxsum = Math.max(sum, maxsum);
                sum = sum - arr[st];
                st++;
            }

        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1, 6, 7 };
        int k = 3;

        int rt = getmax(arr, k);
        System.out.println(rt);
    }
}
