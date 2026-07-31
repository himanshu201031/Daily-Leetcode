package TwoPointers;

public class Stringpalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int start = 0;
        int last = s.length() - 1;

        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    System.out.println("Not a palindrome");
                    return;
                }
                start++;
                last--;
            }
        }

        System.out.println("It is a palindrome");
    }
}
