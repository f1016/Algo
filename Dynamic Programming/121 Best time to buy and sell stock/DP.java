// store the max one until i-th
// compare it with (i-1)th



class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length ==0){
            return 0;
        }
        
        int[] max = new int[prices.length];
        int[] low = new int[prices.length];
        
        low[0] = prices[0];
        max[0] = 0;
        
        
        for(int i = 1 ; i < prices.length ; i++){
            low[i] = Math.min(low[i-1] , prices[i]); // find the lowest price until now
            max[i] = Math.max(max[i-1] , prices[i] - low[i]); //
            
            
        }
     return max[prices.length -1];   
    }
}