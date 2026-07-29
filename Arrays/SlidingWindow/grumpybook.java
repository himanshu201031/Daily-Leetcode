package SlidingWindow;

public class grumpybook {
    
    public  static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int alreadySatisfied = 0;
        int extra = 0;
        int maxExtra = 0;

        // Customers already satisfied
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                alreadySatisfied += customers[i];
            }
        }

        // First window
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        maxExtra = extra;

        // Sliding Window
        for (int i = minutes; i < customers.length; i++) {

            // Remove outgoing customer if owner was grumpy
            if (grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            // Add incoming customer if owner is grumpy
            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            maxExtra = Math.max(maxExtra, extra);
        }

        return alreadySatisfied + maxExtra;
    }



public static void main(String[] args) {
    int minutes=3;
    int []grumpy={0,1,0,1,0,1,0,1};
    int [] customers={1,0,1,2,1,1,7,5};
    int rs=maxSatisfied(customers,grumpy,minutes);
    System.out.println(rs);

}
}
