class Solution {
    public static boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false ;
        
        int[] mapS1 = new int[256] ;
        int[] mapS2 = new int[256] ;
        
        for(int i=0 ; i<s1.length() ; i++) {
            char c1 = s1.charAt(i) ;
            char c2 = s2.charAt(i);
            
            if(mapS1[c1] != mapS2[c2]) return false ;
            
            mapS1[c1] = i + 1 ;
            mapS2[c2] = i + 1 ;
            
        }
        return true ;
    }
}