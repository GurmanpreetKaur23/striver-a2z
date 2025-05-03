class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int[] ans = new int[2];
        for(int i=0 ; i<nums.length ; i++) {
            int num = nums[i] ;

            int more = target - num ;
            if(map.containsKey(more)) {
                ans[0] = map.get(more) ;
                ans[1] = i ;
                return ans ;
            }
            map.put(nums[i] , i) ;
        }
        return ans ;
        
    }
}