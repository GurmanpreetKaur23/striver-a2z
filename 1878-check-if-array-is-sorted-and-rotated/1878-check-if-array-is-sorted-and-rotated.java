class Solution {
    public boolean check(int[] nums) {
        int count = 0 ;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] > nums[(1+i)%nums.length]) count ++;
        }
        if(count>1) return false ;
        return true ;
    }
}