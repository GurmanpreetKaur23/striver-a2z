class Solution {
    List<List<Integer>> ans = new LinkedList<>();
    List<Integer> ds = new LinkedList<>() ;

    public void solve(int[] candidates , int index , int target) {
            if(index==candidates.length) {
                if(target==0) {
                    ans.add(new ArrayList<>(ds)) ;
                }
                return ;
            }

            if(candidates[index]<=target) {
                ds.add(candidates[index]) ;
                solve(candidates , index , target-candidates[index]) ;
                ds.remove(ds.size()-1) ;
             }
             solve(candidates, index+1 , target) ;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates , 0 , target) ;
        return ans ;
    }
}