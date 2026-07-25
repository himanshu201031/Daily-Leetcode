public class counteven {
    public static void main(String[] args) {
        int[] arr = {2,5,8,11,14,17};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.print("count of odd numbers in array is:"+ count);
    }
}
