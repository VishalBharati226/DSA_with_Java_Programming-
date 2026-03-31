class Solution {
    public int maxProfit(int[] prices) {
        int max_price = 0;
        int buy_price = Integer.MAX_VALUE;
        for(int i = 0; i< prices.length; i++){
            if(buy_price < prices[i]){
                int profit = prices[i]- buy_price;
                max_price = Math.max(max_price,profit);
            }
            else{
                buy_price = prices[i];
            }
        }
        return max_price;
    }
}