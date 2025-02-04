class Solution {
    public int maxProfit(int[] prices) {
        int minProf = Integer.MAX_VALUE ;
        int maxProf = 0;

        for(int i=0 ; i<prices.length ; i++) {
            minProf = Math.min(minProf , prices[i]) ;
            maxProf = Math.max(maxProf , prices[i] - minProf) ;
        }
        return maxProf ;
    }
}