class Solution {
    List<List<Integer>> ans = new LinkedList<>() ;
    List<Integer> ds = new LinkedList<>() ;
    public void solve(int k , int n , int idx) {
            if(n==0 && ds.size()==k) {
                ans.add(new ArrayList<>(ds)) ;
                return ;
            }

            for(int i=idx ; i<=9; i++) {
                if(n<i) {
                    break ;
                }
                ds.add(i) ;
                solve(k , n-i , i+1) ;
                ds.remove(ds.size() - 1) ;
            }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(k , n , 1) ;
        return ans ;
    }
}