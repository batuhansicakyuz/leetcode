package topinterview150;

public class BestTimeBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
/*
rakama bak - ilerdeki rakamlara bak en büyük olan hangisiyse
arada kaç sayı varsa onu bul
 */
        //minprice ilk etapta MAX degere esit olsun, sonra guncelleriz
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        // dongu olsun
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            // max Profit
            else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
