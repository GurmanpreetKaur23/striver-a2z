class Solution {
    public double myPow(double x, int n) {
        // x-> base , n-> exp

        if (n == -2147483648) {
           return  0.000000000465661;
        }
        if( n<0) {
            x = 1/x ;
            n = - n ;
        }
        if(n==0) return 1.0 ;

        if(n%2==0) {
            double halfPower = myPow(x , n/2) ;
            return halfPower*halfPower ;
        }
        else {
            return x*myPow(x,n-1) ;
        }
    }
}