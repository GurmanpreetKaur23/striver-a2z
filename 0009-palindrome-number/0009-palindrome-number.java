class Solution {
    public boolean isPalindrome(int x) {
        int og = x ;
        int rev = 0 ;
        int lastdigit ;

        while(x>0) {
            lastdigit = x%10 ;
            rev = (rev*10)+lastdigit;
            x = x/10 ;
        }

        if(og==rev) return true ;
        return false; 
    }
}