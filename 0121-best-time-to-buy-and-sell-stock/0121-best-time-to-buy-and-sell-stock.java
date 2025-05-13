class Solution {
    public int maxProfit(int[] prices) {
        int maxsum = 0 ;
        int minsum = Integer.MAX_VALUE ;

        for(int i=0 ; i<prices.length ; i++) {
            minsum = Math.min(minsum , prices[i]) ;
            maxsum = Math.max(maxsum , prices[i]-minsum) ;
        }
        return maxsum ;
    }
}