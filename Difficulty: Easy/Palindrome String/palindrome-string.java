class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s) ;
        sb.reverse() ;
        if(s.equals(sb.toString())) return true ;
        return false ;
    }
}