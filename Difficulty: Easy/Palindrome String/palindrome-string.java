class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s) ;
        sb.reverse() ;
        String t = sb.toString() ;
        
        return s.equals(t) ;
    }
}