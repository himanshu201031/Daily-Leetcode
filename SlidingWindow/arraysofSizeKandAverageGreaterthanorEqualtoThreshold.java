package SlidingWindow;

public class arraysofSizeKandAverageGreaterthanorEqualtoThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {

    int count = 0;
    int windowSum = 0;

    // First window
    for(int i = 0; i < k; i++){
        windowSum += arr[i];
    }

    if(windowSum >= threshold * k){
        count++;
    }

    // Sliding window
    for(int i = k; i < arr.length; i++){

        windowSum += arr[i] - arr[i-k];

        if(windowSum >= threshold * k){
            count++;
        }
    }

    return count;
}


public static void main(String[] args) {
    int [] arr={2,2,2,2,5,5,5,8};
    int threshold=4;
    int k=3;
    int rs=numOfSubarrays(arr,k,threshold);
    System.out.println(rs);
}
}
