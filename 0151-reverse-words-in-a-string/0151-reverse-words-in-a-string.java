class Solution {
    public String reverseWords(String s) {
        // trim and split
        String[] words = s.trim().split("\\s+") ;
        
        // stringbuilder res jis ch append honge
        StringBuilder res = new StringBuilder() ;

        // puthi loop chla ke append kraage
        for(int i=words.length-1 ; i>=0 ; i--) {
            res.append(words[i]).append(" ") ;
        }

        return res.toString().trim() ;
    }
}