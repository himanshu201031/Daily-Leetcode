// public class Majorityelement {
//     public static void main(String[] args) {

//         int[] arr = {3, 2, 3, 3, 2, 1,3};
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {

//             int count = 0;

//             for (int j = 0; j < n; j++) {

//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }

//             }

//             if (count > n / 2) {

//                 System.out.println("Majority element is: " + arr[i]);
//                 return;

//             }

//         }

        

//     }




// }




public class Majorityelement {
    public static void main(String[] args) {

        int[] arr = {1,1,2};
        int n = arr.length;
        int ans=0;
        int fq=0;

        for (int i = 0; i < n; i++) {
            if(fq==0) {
                ans=arr[i];
            }
        if(ans==arr[i]){
                fq++;

        }
        else{
            fq--;
        }
    }
    System.out.println("Majority element is: " + ans);
}
}