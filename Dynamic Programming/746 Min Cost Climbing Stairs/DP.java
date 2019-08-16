class Solution {
    public int minCostClimbingStairs(int[] cost) {
       // dp[n] = cost[n-1] + dp[n-1] or cost[n-2] + dp[n-2];
       // the n-th cost is  not included
       // change the question to what is the min cost up to this stair
	   // Time: O(n) , Space : O(n) 
        int[] dp = new int[cost.length];
        dp[0] = 0;
        dp[1] = 0;
        
        for(int i = 2; i < cost.length ; i++){
            dp[i] = Math.min(cost[i-1] + dp[i-1] , cost[i-2] + dp[i-2]); 
        }
        
        return Math.min(dp[dp.length -2] + cost[dp.length-2] ,
                        dp[dp.length -1] + cost[dp.length-1]);
                       
    }
}