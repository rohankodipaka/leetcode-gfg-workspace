package com.leetcodegfg;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(findMaximumProfit(prices));
    }

    public static long findMaximumProfit(int[] prices){
        long maxProfit = 0;
        for(int i=0; i< prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                int profit = prices[j]-prices[i];
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

}
