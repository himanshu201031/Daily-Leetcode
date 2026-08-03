 package Hashing;

import java.util.HashSet;
// import java.util.Arrays; // Uncomment only if using the sorting approach

public class containDuplicates {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        containDuplicates cd = new containDuplicates();

        int[] nums = {1, 2, 3, 4, 5, 1};

        boolean result = cd.containsDuplicate(nums);

        System.out.println("Contains duplicates: " + result);
    }
}