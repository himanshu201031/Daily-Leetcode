package TwoPointers;

public class SquaresofaSortedArray {
     public static int[] sortedSquares(int[] nums) {
        int [] res=new int [nums.length];
        int rt=nums.length-1;
        int lt=0;
        int k=nums.length-1;
        while(lt<=rt){
            if(Math.abs(nums[lt])>Math.abs(nums[rt])){
                res[k]=nums[lt]*nums[lt];
                lt++;
            }
            else{
                 res[k]=nums[rt]*nums[rt];
                rt--;
            }
            k--;
        }
        return res;
    }
    public static void main(String[] args) {
        int[]nums = {-4,-1,0,3,10};
        int[] rs=sortedSquares(nums);
        for(int i=0;i<nums.length;i++)
        System.out.print("["+rs[i]+",");

    }
}
