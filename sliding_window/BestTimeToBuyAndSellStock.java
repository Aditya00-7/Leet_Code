package sliding_window;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update minimum price
            minPrice = Math.min(minPrice, price);
            // Calculate profit if selling today
            int profit = price - minPrice;
            // Update maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}
