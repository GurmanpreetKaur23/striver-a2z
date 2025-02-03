class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]","") ;
        String rev = new StringBuilder(clean).reverse().toString() ;

        return clean.equals(rev) ;
    }
}