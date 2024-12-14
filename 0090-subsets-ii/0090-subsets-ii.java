class Solution {
    public void solve(int[] nums, int idx , List<List<Integer>> ans , List<Integer> ds) {
        ans.add(new ArrayList<>(ds)) ;

        for(int i=idx ; i<nums.length; i++) {
            if(i!=idx && nums[i]==nums[i-1]) {
                continue ;
            }
            ds.add(nums[i]) ;
            solve(nums , i+1 , ans , ds) ;
            ds.remove(ds.size()-1) ;
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums) ;
        List<List<Integer>> ans = new LinkedList<>() ;
        solve(nums , 0 , ans , new ArrayList<>()) ;
        return ans; 
    }
}