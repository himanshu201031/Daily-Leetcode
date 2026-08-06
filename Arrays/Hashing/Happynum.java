package Hashing;

import java.util.HashSet;

class Happynum {

    public static boolean isHappy(int n) {
 if (n == 1 || n == 7)  return true;  
        if(n<10) return false;    
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return isHappy(sum);
    }




public static void main(String[] args) {
    int n=7;
    boolean rs=isHappy(n);
    System.out.print(rs);

}
}

