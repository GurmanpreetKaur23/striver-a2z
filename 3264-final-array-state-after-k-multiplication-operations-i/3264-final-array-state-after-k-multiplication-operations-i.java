class Solution {
    public int[] getMin(int[] nums) {
        int min = Integer.MAX_VALUE ;
        int idx =0 ;

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]<min) {
                min = nums[i]; 
                idx = i ;
            }
        }
        return new int[] {min , idx} ;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] ans = new int[2]; // min,idx

        for(int i=0 ; i<k ; i++){
            ans = getMin(nums) ;
            nums[ans[1]] = ans[0] * multiplier ;
        }
        return nums;
    }
}