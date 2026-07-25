public class insertatindex {
     public static void main(String[] args) {

        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int size = 4;

        int index = 2;
        int value = 25;

        // Shift elements

        for (int i = size - 1; i >= index; i--) {

            arr[i + 1] = arr[i];

        }

        arr[index] = value;

        size++;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
