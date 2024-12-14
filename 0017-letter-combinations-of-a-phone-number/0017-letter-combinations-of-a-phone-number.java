class Solution {
    public void solve(int idx, String digits , String str , Map<Character , String> mp , List<String> ans) {
        if(idx == digits.length()) {
            ans.add(str) ;
            return  ;
        }
        
        for(char c : mp.get(digits.charAt(idx)).toCharArray()) {
            str += c ;
            solve(idx+1 , digits , str , mp , ans) ;
            str = str.substring(0 , str.length()-1) ;
        }
    }
    public List<String> letterCombinations(String digits) {
        
        if(digits.isEmpty()) return new ArrayList<>() ; 
        Map<Character, String> mp = new HashMap<>() ;
        
        mp.put('2' , "abc") ;
        mp.put('3' , "def") ;
        mp.put('4' , "ghi") ;
        mp.put('5' , "jkl") ;
        mp.put('6' , "mno") ;
        mp.put('7' , "pqrs") ;
        mp.put('8' , "tuv") ;
        mp.put('9' , "wxyz") ;
        
        List<String> ans = new ArrayList<>() ;
        solve(0 , digits , "" , mp , ans) ;
        return ans ;
    }
}