public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 15, 20, 25,31,32,43,44,55,66,73,75,81,82,100};
        int target = 81;

        int left = 0;
        int right = arr.length - 1;

        while (left<=right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {

                System.out.println("Found at index: " + mid);
                return;

            } else if (arr[mid] < target) {

                left = mid -1;

            } else {

                right = mid + 1;

            }
        }

        System.out.println("Element not found");
    }
}