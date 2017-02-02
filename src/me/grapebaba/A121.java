package me.grapebaba;


public class A121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length < 2) {
            return maxProfit;
        }

        int previousMinPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - previousMinPrice > maxProfit) {
                maxProfit = prices[i] - previousMinPrice;
            }
            if (prices[i] < previousMinPrice) {
                previousMinPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
