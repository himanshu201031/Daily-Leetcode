package Hashing;

import java.util.HashMap;

public class twosum {

public static int[] twoSumhash(int[] nums, int target) {
    HashMap <Integer,Integer> map=new HashMap<>();

for(int i=0;i<nums.length;i++){
        int value=target-nums[i];
       if(map.containsKey(value)){

           return new int[]{map.get(value),i};
       }
       map.put(nums[i],i);

    }
    return new int[]{-1,-1};




}


    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=18;
int [] rs=twoSumhash(nums,target);
        System.out.println("[" + rs[0] + ", " + rs[1] + "]");

    }
}
