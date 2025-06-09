// User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int d1 = -1 ;
        int d2 = -1 ;
        int ans = Integer.MAX_VALUE ;
        
        for(int i=0 ; i<s.size() ; i++) {
            if(s.get(i).equals(word1)) d1 = i ;
            if(s.get(i).equals(word2)) d2 = i ;
            
            if(d1!=-1 && d2!=-1) {
                ans = Math.min(ans , Math.abs(d1 - d2)) ;
            }
        }
        return ans ;
    }
};