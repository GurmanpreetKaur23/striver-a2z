class Solution {
    public boolean isAnagram(String s, String t) {
        // length check krage
        if(s.length() != t.length()) return false ;

        // convert to char array 
        char[] s1 = s.toCharArray() ;
        char[] t1 = t.toCharArray() ;

        Arrays.sort(s1) ;
        Arrays.sort(t1) ;

        return Arrays.equals(s1 , t1);
    }
}