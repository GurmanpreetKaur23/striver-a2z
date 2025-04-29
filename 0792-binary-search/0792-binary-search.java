class Solution {
    public int search(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1 ;

        for(int i=0 ; i<nums.length ; i++) {
            int mid = (start+end) / 2 ;

            if(nums[mid]==target) return mid ;
            if(nums[mid]>target) end = mid-1 ;
            else start = mid+1 ;
        }
        return -1 ;
    }
}