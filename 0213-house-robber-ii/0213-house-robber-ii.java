class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length ;
        if(n==0) return 0 ;
        if(n==1) return nums[0];
        int case1 = solve(nums , 0 , n-2) ;
        int case2 = solve(nums , 1 , n-1) ;
        return Math.max(case1 , case2) ;
    }

    public int solve(int[] nums , int start , int end) {
        int prev1 = 0 ;
        int prev2 = 0 ;
        if(start > end) return 0 ;
        for(int i=start ; i<=end ; i++) {
            int pick = nums[i] + prev2 ;
            int notpick = prev1 ;

            int curr = Math.max(pick , notpick) ;
            prev2 = prev1 ;
            prev1 = curr ;
        }
        return prev1; 
        
    }
}

