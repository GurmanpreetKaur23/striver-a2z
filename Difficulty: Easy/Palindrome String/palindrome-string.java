class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s) ;
        
        return s.equals(sb.reverse().toString()) ;
    }
}