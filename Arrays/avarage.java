public class avarage {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int average=sum/arr.length;
        System.out.print("average of array is:"+ average);
    }
}
