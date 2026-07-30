package TwoPointers;

public class reversestring {
    public static void main(String[] args) {
        char[] str = "Hello World".toCharArray();
        int left = 0;
        int right = str.length - 1;
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(str));
    }
}
