class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums) ;
        int n = nums.length ;
        int maxlen = 1 ;
        int curr = 1 ;
        if(n==0) return 0 ;
        
        for(int i=1 ; i<n ; i++) {
            if(nums[i] == nums[i-1]) continue ; // skip duplicates
            if(nums[i] == (nums[i-1]+1)) curr++;
            else curr = 1 ;

            maxlen = Math.max(maxlen , curr) ;
        }
       
        return maxlen ;
    }
}