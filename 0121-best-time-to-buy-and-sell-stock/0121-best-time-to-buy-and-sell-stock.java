class Solution {
    public int maxProfit(int[] prices) {
        int min_val = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit_today = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_val){
                min_val = prices[i];
            }
            profit_today = prices[i] - min_val;
            if(profit_today > maxprofit){
                maxprofit = profit_today;
            }
        }
        return maxprofit;
    }
}