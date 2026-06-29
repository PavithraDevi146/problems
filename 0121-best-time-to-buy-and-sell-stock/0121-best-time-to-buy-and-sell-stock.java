class Solution {
    public int maxProfit(int[] prices) {
        int min_buy=prices[0];
        int max_profit=0;
        for (int i=1;i<prices.length;i++){
            if (prices[i]<min_buy){
                min_buy=prices[i];
            }else{
                int max=prices[i]-min_buy;
                max_profit= Math.max(max,max_profit);
            }
        }
        return max_profit;
    }
}