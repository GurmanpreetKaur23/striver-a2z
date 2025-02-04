class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] idx = new int[256] ;
        int maxlen = 0 , left = 0 ;

        for(int right = 0 ; right<s.length() ; right++) {
            left = Math.max(left , idx[s.charAt(right)]) ;
            maxlen = Math.max(maxlen , right - left + 1) ;
            idx[s.charAt(right)] = right+1 ;
        }
        return maxlen ;
    }
}