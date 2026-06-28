/**
 * Time Complexity: O(n^2) - Checking all possible pairs of buy and sell days.
 * Space Complexity: O(1) - Constant space used.
 */
package arrays_strings.brute;

public class BestTimeToBuyAndSellStockBrute {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        // Loop through every possible buying day
        for (int i = 0; i < prices.length; i++) {
            // Loop through every possible selling day after day i
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockBrute solver = new BestTimeToBuyAndSellStockBrute();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Brute Force Output: " + solver.maxProfit(prices)); // Expected: 5
    }
}