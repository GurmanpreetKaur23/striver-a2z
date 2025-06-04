class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s) ;
        sb.reverse() ;
        return s.equals(sb.toString());
    }
}