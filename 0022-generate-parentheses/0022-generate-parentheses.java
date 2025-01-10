class Solution {
    void solve(int left , int right , List<String> res , String s , int n) {
        if(s.length() == n*2) {
            res.add(s) ;
            return  ;
        }
        if(left<n) solve(left+1 , right , res , s+"(" , n) ;
        if(right<left) solve(left , right+1 , res , s+")" , n) ;
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>(); 
        solve(0 , 0 , res , "" , n) ;
        return res ;
    }
}