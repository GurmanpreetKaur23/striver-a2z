class Solution {
    List<List<Integer>> res = new LinkedList<>() ;
    LinkedList<Integer> track = new LinkedList<>() ;

    public void backtrack(int nums[] , int start) {
        res.add(new LinkedList<>(track)) ;
        for(int i=start ; i<nums.length ; i++) {
            track.add(nums[i]) ;
            backtrack(nums , i+1) ;
            track.removeLast() ;
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums , 0) ;
        return res;
    }
}