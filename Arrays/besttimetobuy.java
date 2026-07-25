public class besttimetobuy {
    public static void main(String[] args) {
        int []prices={7,1,5,4,6,8};
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            maxProfit = Math.max(maxProfit, prices[i] - minPrice);

            minPrice = Math.min(minPrice, prices[i]);
        }

        System.out.println("Maximum profit: " + maxProfit);
    }
}
