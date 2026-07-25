public class findmin {
     public static void main(String[] args) {
        int [] arr={1,3,14,5,2,8,};
int min=arr[0];
        for(int i=1;i<arr.length;i++)

            if(min>arr[i]){
                min=arr[i];
            }
            System.out.print("max value is:"+ min);
        }
}



