class Solution {
    List<List<Integer>> res = new LinkedList<>() ;
    List<Integer> track = new ArrayList<>() ;
    void solve(int[] nums , int start) {
        res.add(new ArrayList<>(track)) ;
        for(int i=start ; i<nums.length ; i++) {
            track.add(nums[i]) ;
            solve(nums , i+1) ;
            track.removeLast() ;
        }
    }
    public List<List<Integer>> subsets(int[] nums) {

        solve(nums , 0) ;
        return res ;
    }
}