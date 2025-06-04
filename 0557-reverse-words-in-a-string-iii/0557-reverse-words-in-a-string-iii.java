class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+") ;

        StringBuilder sb = new StringBuilder() ;
        for(int i=0 ; i<words.length; i++) {
            StringBuilder rev = new StringBuilder(words[i]) ;
           sb.append(rev.reverse()) ;

           if(i!=words.length - 1) sb.append(" ") ;

        }
        return sb.toString();
    }
}