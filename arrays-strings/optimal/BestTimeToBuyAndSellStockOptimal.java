/**
 * Time Complexity: O(n) - Single pass through the prices array tracking the running minimum.
 * Space Complexity: O(1) - Constant memory allocation.
 */
package arrays_strings.optimal;

public class BestTimeToBuyAndSellStockOptimal {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = prices[0]; // Tracking running min price
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Agar aaj bechein to profit kya hoga
            int currentProfit = prices[i] - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
            // Minimum price ko update karein
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockOptimal solver = new BestTimeToBuyAndSellStockOptimal();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Optimal Output: " + solver.maxProfit(prices)); // Expected: 5
    }
}