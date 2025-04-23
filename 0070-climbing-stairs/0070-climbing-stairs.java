class Solution {
    public int climbStairs(int n) {
        // optimized
        int prev1 = 1 , prev2 = 1 , curr = 0;
        if(n==0 || n==1) return 1 ;

        for(int i=2 ; i<=n ; i++) {
            curr = prev1 + prev2 ;
            prev2 = prev1 ;
            prev1 = curr ;
        } 
        return curr ;

    }
}