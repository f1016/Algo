class Solution {
    public int rob(int[] nums) {
        // question : rob n-th or not?
        // dp : the largest gain in each step
        // rob n-1th or rob this + n-2th
        if(nums.length == 0){
            return 0 ;
        }
        if(nums.length == 1){
            return nums[0];
        }
 
        int[] dp = new int[nums.length];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]); // choose the best to start
        for(int i = 2 ; i < nums.length ; i++){
            dp[i] = Math.max(dp[i-1] , dp[i-2] + nums[i]);
        }
        return Math.max(dp[nums.length-2],dp[nums.length-1]);
    }
}