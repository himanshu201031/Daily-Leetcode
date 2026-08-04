package Hashing;
import java.util.HashSet;
public class IntersectionofTwoArrays {
     public  static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        return set2.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2,1};
        int[] rt=IntersectionofTwoArrays.intersection(nums1,nums2);
        for(int i=0;i<rt.length;i++){
            System.out.print(rt[i]+" ");
        }
    }
}