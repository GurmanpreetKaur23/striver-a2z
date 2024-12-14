class Solution {
    public static void solve(int n , int left , int right , String s , List<String> ans) {
        if(s.length()==n*2) {
            ans.add(s) ;
            return ;
        }
        
        if(left<n) {
            solve(n , left+1 , right , s + "(" , ans) ;
        }
        if(right<left) {
            solve(n, left , right+1 , s+ ")", ans) ;
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>() ;
        solve(n , 0 , 0 , "" , ans) ;
        return ans ;
    }
}