class Solution {
    
    public static void solve(int[] candidates , int target , int idx , List<List<Integer>> ans , List<Integer> ds) {
        if(target==0) {
            ans.add(new ArrayList<>(ds)) ;
            return ;
        }
        for(int i=idx ; i<candidates.length ; i++) {
            if(i>idx && candidates[i]==candidates[i-1]) continue ;
            if(candidates[i]>target) break ;

            ds.add(candidates[i]) ;
             solve(candidates , target-candidates[i] , i+1 , ans , ds) ;
             ds.remove(ds.size()-1) ;
        }
       
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new LinkedList<>() ;
        Arrays.sort(candidates) ;
        solve(candidates , target , 0 , ans , new ArrayList<>()) ;
        return ans ;
    }
}