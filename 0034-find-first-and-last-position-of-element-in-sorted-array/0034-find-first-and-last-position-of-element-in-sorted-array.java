class Solution {
    public int firstOcc(int[] nums , int target , int start , int end) {
        int res = -1 ;
        while(start<=end) {
            int mid = start + (end - start)/2 ;

            if(nums[mid]==target) {
                res = mid ;
                end = mid - 1 ;
            }
            else if(nums[mid]>target) end--;
            else start++ ;
        }
        return res ;
    }
    public int lastOcc(int[] nums , int target , int start , int end) {
        int res = -1 ;
        while(start<=end) {
            int mid = start + (end - start)/2 ;

            if(nums[mid]==target) {
                res = mid ;
                start = mid + 1 ;
            }
            else if(nums[mid]>target) end-- ;
            else start++ ;
        }
        return res ;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums , target , 0 , nums.length-1) ;
        int last = lastOcc(nums , target , 0 , nums.length-1) ;
        return new int[] {first , last} ;

    }
}