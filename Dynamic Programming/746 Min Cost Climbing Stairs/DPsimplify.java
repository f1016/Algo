class Solution {
    public int minCostClimbingStairs(int[] cost) {
       // dp[n] = cost[n-1] + dp[n-1] or cost[n-2] + dp[n-2];
       // the n-th cost is included
       // change the question to what is the min cost up to this stair
       // Time: O(n) , Space : O(1) 

         for(int i = 2 ; i< cost.length ; i++){
             cost[i] += Math.min(cost[i-1] , cost[i-2]);
         }
        
        return Math.min(cost[cost.length-1] , cost[cost.length-2]);
                       
    }
}