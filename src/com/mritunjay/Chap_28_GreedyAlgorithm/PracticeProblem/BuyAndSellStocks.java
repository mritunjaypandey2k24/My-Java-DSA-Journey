package com.mritunjay.Chap_28_GreedyAlgorithm.PracticeProblem;

public class BuyAndSellStocks {

    public static int BuySell(int [] prices){
        int buy =prices[0];
        int maxProfit =0;

        for(int i=1; i< prices.length; i++){
            int profit =0;
            if(prices[i]>= buy){
                profit = prices[i]-buy;
            }else{
                buy = prices[i];
            }
            maxProfit = Math.max(maxProfit,profit);

        }

        return  maxProfit;
    }

    public static void main(String [] args){
        int []prices1 = {7,6,4,3,1};
        int []prices2 = {7,1,5,3,6,4};

        System.out.println(BuySell(prices1));
        System.out.println(BuySell(prices2));

    }
}
