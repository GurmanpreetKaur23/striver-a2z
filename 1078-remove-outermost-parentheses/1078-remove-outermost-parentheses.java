class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder() ;
        int balance = 0 ;
        for(char c: s.toCharArray()) {
            if(c==')') balance-- ;
            if(balance>0) res.append(c) ;
            if(c=='(') balance++ ;
        } 
        return res.toString() ;
        }
}