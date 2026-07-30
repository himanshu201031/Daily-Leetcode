package TwoPointers;

public class pairsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int target = 6;

        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                return;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("No pair found");
    }
}

