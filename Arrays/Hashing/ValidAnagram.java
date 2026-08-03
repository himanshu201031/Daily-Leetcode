package Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        for (char ch : t.toCharArray()) {
            if (map.getOrDefault(ch, 0) == 0) {
    return false;
}
   map.put(ch, map.get(ch) - 1);
            }

        
return true;
    }



    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        boolean result = va.isAnagram(s, t);

        System.out.println("Is anagram: " + result);
    }
}

