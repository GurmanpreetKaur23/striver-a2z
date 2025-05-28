class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>() ;
        int count = 0 ;
        for(int i=0 ; i<nums.length ; i++) {
            if(s.contains(nums[i])) continue;
            else {
                s.add(nums[i]) ;
                nums[count] = nums[i] ;
                count++;
            }
        }
        return count;
    }
}