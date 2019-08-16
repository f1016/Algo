class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length ==0){
            return 0;
        }
        
        int lowest = prices[0];
        int max = 0;
        
        for(int i = 1 ; i < prices.length ; i++){
            lowest = Math.min(lowest,prices[i]); // find the lowest price
            max = Math.max(prices[i] - lowest, max); // find the max profit
        }
     return max;   
    }
}