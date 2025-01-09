class Solution {
    public int reverse(int x) {
        long rev = 0 ;
        int lastDigit ;
        
       
        while(x!=0) {
            lastDigit = x%10 ;
             
            x = x/10 ;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE) return 0 ;
            if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE) return 0 ;
          rev = (rev * 10) + lastDigit ;
        }
        return (int)rev ;
    }
}