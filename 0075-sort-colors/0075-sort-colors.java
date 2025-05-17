class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0 ; 
        int c1 = 0 ; 
        int c2 = 0 ;

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] == 0) c0++;
            else if(nums[i]==1 ) c1++;
            else c2++ ;
        }
        int idx = 0;
        for(int i=0 ; i<c0 ; i++) {
            nums[idx++] =0 ;
        }
        for(int i=0 ; i<c1 ; i++){
            nums[idx++] = 1;
        }
        for(int i=0 ; i<c2 ; i++) {
            nums[idx++] = 2;
        }
    }
}