class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i=0 ; i<nums.length ; i++) {
            map.put(nums[i] , i) ;
        }
        for(int i=0 ; i<nums.length ; i++) {
            int more = target - nums[i] ;

            if(map.containsKey(more) && map.get(more)!=i) {
                return new int[] {i , map.get(more)} ;
            }
        }
        return new int[]{} ;
    }
}