public class SortColors {
    public static void main(String[] args) {

        int arr[] = { 2, 1, 0, 2, 2, 1, 1, 0, 2, 2, 1 };
        int n = arr.length;
        int l = 0, mid = 0, h = n - 1;

        while (mid <= h) {

            if (arr[mid] == 0) {
                swap(arr, l, mid);
                l++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, h);
                h--;
            }

        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Swap elements at indices i and j in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
