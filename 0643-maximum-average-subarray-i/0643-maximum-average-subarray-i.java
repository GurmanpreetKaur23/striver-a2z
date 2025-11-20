class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0 ;
        double max = 0 ;
        for(int i=0 ; i<k ; i++) sum += nums[i] ;
        max = sum / k ;
        for(int i=k ; i<nums.length ; i++) {
            sum += nums[i] ;
            sum -= nums[i-k] ;
            max = Math.max(max , sum/k) ;
        }
        return max ;
    }
}