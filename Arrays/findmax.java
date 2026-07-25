
public class findmax{
    public static void main(String[] args) {
        int [] arr={1,3,14,5,2,8,};
int max=arr[0];
        for(int i=1;i<arr.length;i++)

            if(max<arr[i]){
                max=arr[i];
            }
            System.out.print("max value is:"+ max);
        }
        
    }
