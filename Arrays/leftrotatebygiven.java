public class leftrotatebygiven {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int d = 2;
        for(int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
    } 
}
