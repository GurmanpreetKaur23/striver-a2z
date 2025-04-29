class Solution {
    public int helper(int[] nums , int n , int[] dp) {
        if(n==0) return nums[0];
        if(n<0) return 0 ;
        dp[0] = nums[0];
        // int neg = 0 ;
        int pick , notpick ;
        for(int i=1 ; i<n ; i++) {
            pick = nums[i] ;

            if(i>1) {
                pick += dp[i-2] ;
            }
            notpick = dp[i-1] ;
            dp[i] = Math.max(pick, notpick);
        }
        
        return dp[n-1] ;
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length] ;
        // Arrays.fill(dp , -1) ;
        return helper(nums , nums.length , dp) ;
    }
}