class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen = 0 , left = 0 , zero = 0;
        for(int right =0; right<nums.length ; right++) {
            if(nums[right]==0) {
                zero++ ;
            }

            while(zero>k) {
                if(nums[left]==0) zero-- ;

                left++ ;
            }
            maxlen = Math.max(maxlen , right-left+1) ;
        }
        return maxlen ;
    }
}