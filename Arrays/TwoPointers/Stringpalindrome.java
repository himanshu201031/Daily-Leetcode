package TwoPointers;

public class Stringpalindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("It is a palindrome");
    }
}


