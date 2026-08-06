package TwoPointers;
public class twosumII {
    public static int[] twosum(int[] arr, int target) {
        int lt = 0;
        int n = arr.length;
        int rt = n - 1;
        int sum = 0;
        while (lt < rt) {
            sum = arr[lt] + arr[rt];
            if (sum == target) {
                return new int[] { lt+1 , rt+1 };
            } else if (sum > target) {
                rt--;
            } else {
                lt++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 8, 12 };
        int target = 10;
        int[] rs = twosum(arr, target);
        System.out.print("[" + rs[0] + ", " + rs[1] + "]");
    }
}
