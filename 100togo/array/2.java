class Solution {
    public int maxProfit(int[] prices) {
        
        int right = prices[prices.length-1];
        int profit=0; int max_profit=0;

        for(int i=prices.length-2;i>=0;i--){

            if(prices[i]<right){
                profit = right-prices[i];
                max_profit = Math.max(max_profit,profit);
            } else {
                right = prices[i];
            }
        }
        return max_profit;
    }
}