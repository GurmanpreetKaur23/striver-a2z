class Solution {
    List<String> ans = new ArrayList<>() ;
    public void solve(int left , int right , int n , String s) {
        if(s.length()==n*2) {
            ans.add(s) ;
            return ;
        }

        if(left<n) solve(left+1 , right , n , s+"(") ;
        if(right<left) solve(left , right+1 , n , s+")") ;
    }

    public List<String> generateParenthesis(int n) {
        solve(0 , 0 , n ,"") ;
        return ans ;
    }
}