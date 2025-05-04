class Solution {
    public int maxProfit(int[] prices) {
        int maxpro = 0 ;
        int minpri = Integer.MAX_VALUE ;
        for(int i=0 ; i<prices.length ; i++ ) {
            minpri = Math.min(minpri , prices[i]) ;
            maxpro = Math.max(maxpro , prices[i] - minpri) ;
        }
        return maxpro ;
    }
}