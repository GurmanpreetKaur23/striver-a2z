class Solution {
    public boolean isPalindrome(int x) {
        int og = x ;
        int rev = 0 ;
        int lastDigit ;

        while(x >0) {
            lastDigit = x%10 ;
            rev = (rev*10) + lastDigit ;
            x = x/10 ;
        }
        if(og==rev) return true ;
        return false;
    }
}