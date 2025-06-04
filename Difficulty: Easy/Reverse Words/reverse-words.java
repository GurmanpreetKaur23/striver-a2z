class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        String[] words = s.split("\\s+") ;
        
        StringBuilder rev = new StringBuilder() ;
        for(int i=words.length - 1 ; i>=0 ; i--) {
            rev.append(words[i]) ;
            
            if(i!=0) rev.append(" ") ;
        
        }
        return rev.toString().trim() ;
    }
}
