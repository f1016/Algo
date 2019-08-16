// find the profit of consecutive day
// find the largest profit up to i-th day ( max subarray up to i-th day)
// sort it
//Time: O(n) * 2 Space:O(n) 

class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length == 1 || prices.length == 0){
            return 0;
        }
        
        int[] max = new int[prices.length -1];
        int[] profit = new int[prices.length -1];
        for(int i = 0 ; i < profit.length ; i++){
            profit[i] = prices[i+1] - prices[i];
        }
        
        max[0] = profit[0];
        
        for(int i = 1 ; i < profit.length ; i++){
            max[i] = Math.max(profit[i] , max[i-1] + profit[i]); // find the max subarray up to i-th
        }
        
        Arrays.sort(max); // Or we can just use an other variable to store the max using Math.max(max[i],temp);

     return Math.max(0,max[max.length -1]);   
    }
}
