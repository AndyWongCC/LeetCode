class Solution {
    public int maxProfit(int[] prices) {
        int compareNum = Integer.MAX_VALUE;
        int ans = 0;
        int todaytrade = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < compareNum){
                compareNum = prices[i];
            }
            todaytrade = prices[i] - compareNum;
            if(ans < todaytrade){
                ans = todaytrade;
            }
        }
        return ans;
    }
}