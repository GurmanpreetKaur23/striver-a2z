class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length() != s2.length()) return false ;
        
        int[] freq1 = new int[26] ;
        int[] freq2 = new int[26] ;
        
        for(char c : s1.toCharArray()) {
            freq1[c - 'a']++ ;
        }
        
        for(char c : s2.toCharArray()) {
            freq2[c - 'a']++ ;
        }
        
        int changes = 0 ;
        
        for(int i=0 ; i<26 ; i++) {
            if(freq1[i] > freq2[i]){
                changes += freq1[i] - freq2[i] ;
            }
        }
        
        return changes<=k ;
    }
}