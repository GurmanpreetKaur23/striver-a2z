class Solution {
    List<List<Integer>> ans = new LinkedList<>() ;
    List<Integer> ds = new LinkedList<>() ;
    public void solve(int[] candidates , int i , int target) {
        if(i==candidates.length){
            if(target==0) {
            ans.add(new ArrayList<Integer>(ds)) ;
        }
        return ;
        }
        if(target>=candidates[i]) {
            // pick
            ds.add(candidates[i]) ;
            solve(candidates , i , target-candidates[i]) ;
            ds.remove(ds.size()-1) ;
        }
        // not pick 
        solve(candidates, i+1 , target)  ;

        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates , 0 , target) ;
        return ans ;
        
    }
}