class Solution {
    List<List<Integer>> ans = new LinkedList<>() ;
    List<Integer> ds = new LinkedList<>() ;
    public void solve(int idx , int[] nums) {
       
            ans.add(new ArrayList<>(ds)) ;
            
        for(int i=idx ; i<nums.length ; i++) {
            if(i!=idx && nums[i] == nums[i-1]) continue ;
            ds.add(nums[i]) ;
            solve(i+1 , nums) ;
            ds.remove(ds.size()-1) ;
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums) ;
        solve(0 , nums) ;
        return ans ;
    }
}