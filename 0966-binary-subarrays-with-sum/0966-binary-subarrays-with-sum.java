class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length ;
        int[] prefixSum = new int[n+1] ;
        int totalCount = 0 , sum = 0 ;
        prefixSum[0] = 1 ;

        for(int num : nums) {
            sum += num ;

            if(sum>=goal) {
                totalCount+=prefixSum[sum-goal] ;
            }
            prefixSum[sum]++ ;
        }
        return totalCount ;
    }
}