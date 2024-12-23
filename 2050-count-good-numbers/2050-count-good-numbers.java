class Solution {
   public long MOD = 1000000007; 
    private long pow(long base , long exp){
        if(exp<0) return -1 ;
        if(exp==0) return 1 ;

        if(exp%2==0) {
            long halfPower = pow(base , exp/2) ;
            return (halfPower*halfPower) % MOD;
        }
        else {
            return base * pow(base, exp-1) % MOD;
        }
    }
    public int countGoodNumbers(long n) {
        long odd = n/2 ;
        long even = (n+1)/2 ;
        return (int)((pow(5 , even)*pow(4 , odd)) % MOD );
    }
}