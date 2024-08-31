package org.example.Array;

public class MaxProfit {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int minPrice = Integer.MAX_VALUE;

       for (int i = 0; i < prices.length; i++) {
           if (prices[i] < minPrice) {
               minPrice = prices[i];
           } else if (prices[i] - minPrice > maxProfit) {
               maxProfit = prices[i] - minPrice;
           }
       }

        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices1)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + solution.maxProfit(prices2)); // Output: 0
    }
}
