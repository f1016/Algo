class Solution {
    public int rob(int[] nums) {
        //the max gain up to n -th
        //n-th = max(n-2-th / n-3-th )+ n-th
		
        if(nums.length == 0){
            return 0;
        }
        if(nums.length <2){
            return nums[0];
        }
        if(nums.length < 3){
            return Math.max(nums[0],nums[1]);
        }
        
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[2] + dp[0]; //  dp[2] must include dp[0] but dp[0] doesn't  include dp[2] necessarily
        
        for(int i = 3; i < dp.length ; i++){
            dp[i] = Math.max( dp[i-2] , dp[i-3]) + nums[i];
            
        }
        
        return Math.max(dp[dp.length -1 ] , dp[dp.length -2 ]);
    }
}