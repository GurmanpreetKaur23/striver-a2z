// User function template for JAVA

class Solution {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // your code here
        boolean[] seen = new boolean[26] ;
        
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                seen[Character.toLowerCase(c) - 'a'] = true ;
            }
        }
        
        for(boolean b : seen) {
            if(!b) return false; 
        }
        return true ;
    }
}