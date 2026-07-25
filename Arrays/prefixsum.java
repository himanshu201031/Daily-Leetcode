public class prefixsum {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10};

        int[] prefix = new int[arr.length];

        // Build Prefix Array

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            prefix[i] = prefix[i - 1] + arr[i];

        }

        // Find Sum from index 2 to 4

        int left = 2;
        int right = 4;

        int sum;

        if (left == 0) {

            sum = prefix[right];

        } else {

            sum = prefix[right] - prefix[left - 1];

        }

        System.out.println(sum);
    }
}
