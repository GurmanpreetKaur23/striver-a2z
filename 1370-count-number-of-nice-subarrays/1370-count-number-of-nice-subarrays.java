class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int totalCount = 0 , sum = 0 ;
        int[] prefixSum = new int[nums.length + 1] ;
        prefixSum[0] = 1 ;

        for(int num : nums) {
            sum += (num %2) ;

            if(sum>=k) {
                totalCount += prefixSum[(sum - k)] ;
            }
            prefixSum[sum]++ ;
        }
        return totalCount ;
    }
}