class Solution {
     public static void solve(int idx, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ans) {
        if(target==0) {
            ans.add(new ArrayList<>(ds)); 
            return ;
        }
        
        for(int i=idx ; i<candidates.length ; i++) {
            if(i>idx && candidates[i]==candidates[i-1]) {// skip the iteration if duplicates
                continue ;
            }
            
            if(candidates[i]>target) break ;
            
            ds.add(candidates[i]) ;
            solve(i+1, candidates , target-candidates[i] , ds , ans) ;
            ds.remove(ds.size()-1) ;
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new LinkedList<>() ;
        
        Arrays.sort(candidates) ;
        solve(0 , candidates , target , new ArrayList<>() , ans) ;
        return ans ;
    }
}