class Solution {
    List<List<String>> ans = new LinkedList<>() ;
    List<String> ds = new ArrayList<>() ;

    boolean isPalindrome(String s, int start , int end) {
        while(start<=end) {
            if(s.charAt(start++) != s.charAt(end--)) return false ;
        }
        return true ;
    }
    void solve(String s , int idx) {
        if(s.length() == idx) {
            ans.add(new ArrayList<>(ds)) ;
            return ;
        }

        for(int i=idx ; i<s.length() ; i++) {
            if(isPalindrome(s , idx , i)) {
                ds.add(s.substring(idx , i+1)) ;
                solve(s , i+1) ;
                ds.remove(ds.size() - 1) ;
            }
        }
    }
    public List<List<String>> partition(String s) {
        solve(s , 0) ;
        return ans ;
    } 
}