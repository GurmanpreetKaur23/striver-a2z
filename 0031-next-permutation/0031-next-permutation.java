class Solution {
    public static void reverse(int[] nums , int start , int end ) {
        while(start<=end) {
            swap(nums , start , end) ;
            start++ ;
            end-- ;
        }
    }

    public static void swap(int[] nums , int i , int j) {
        if(i>=0 && j>=0){
            int temp = nums[i] ;
            nums[i] = nums[j] ;
            nums[j] = temp ;
        }
    }

    public void nextPermutation(int[] nums) {
        // 1 2 3
        int i = nums.length - 2 ; // 2
        while(i>=0 && nums[i]>=nums[i+1]) {
            i-- ;
        }

        if(i>=0) {
            int j = nums.length - 1 ; // 3 
            while(j>=0 && nums[j] <= nums[i]) {
                j-- ;
            }
            swap(nums , i , j ) ;
        }

        reverse(nums , i+1 , nums.length - 1) ;
    }
}