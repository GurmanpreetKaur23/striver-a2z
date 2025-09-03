class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character, Integer> lastseen = new HashMap<>() ;

       int len = 0 ;
       int n = s.length() ;
        int left = 0 ;
       for(int right = 0 ; right<n ; right++) {
        char c = s.charAt(right) ;

        if(lastseen.containsKey(c)) left = Math.max(left , lastseen.get(c) + 1) ;
        lastseen.put(c , right) ;

        len = Math.max(len , right - left + 1) ;
       } 
       return len ;
       
    }
}