class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length ;

        HashMap<Integer , Integer> map = new HashMap<>() ;

        for(int num : nums) {
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        for(int num : nums) {
            if(map.get(num) == 1) return num ;
        }
        return 0 ;

    }
}