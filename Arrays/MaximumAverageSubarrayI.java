public class MaximumAverageSubarrayI {
    public static int maxavg(int[] arr,int k){
       int n=arr.length;
       int ans=0;
       int window=0;

       for(int i=0;i<k;i++){
        window+=arr[i];

       }
       ans= window/k;
       for(int rt=k;rt<n;rt++){
        window += arr[rt]-arr[rt-k];
        ans=Math.max(ans,window/k);

       }

return ans;
    }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;
        int rt=maxavg(arr,k);
        System.out.println(rt);
    }
    
}
