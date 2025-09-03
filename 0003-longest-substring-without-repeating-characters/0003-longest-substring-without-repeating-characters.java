class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length() ;
        int maxlen = 0 ;

        for(int i=0 ; i<n ; i++) {
            Set<Character> set = new HashSet<>() ;
            for(int j=i ; j<n ; j++) {
                if(set.contains(s.charAt(j))) break ;
                set.add(s.charAt(j)) ;

                maxlen = Math.max(maxlen , j-i+1) ;
            }
        }
        return maxlen ;
    }
}