class Solution {
    public void solve(int k , int n , int idx , List<List<Integer>> ans , List<Integer> ds) {
        if(k==0 && n==0) {
            ans.add(new ArrayList<>(ds)) ;
            return ;
        }
        
        if(k==0 || n<0) {
            return ;
        }
        
        for(int i=idx ; i<=9 ; i++) {
            ds.add(i) ;
            solve(k-1 , n-i , i+1 , ans , ds) ;
            ds.remove(ds.size()-1) ;
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new LinkedList<>() ;
        solve(k, n,1, ans , new ArrayList<>()) ;
        return ans ;
    }
}