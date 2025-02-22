class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rightidx , right = 0 , left = 0 ,  n = cardPoints.length - 1  , maxsum = 0;

        for(int i=0 ; i<k ; i++){
            left += cardPoints[i] ;
        }

        maxsum = left ;
        rightidx = n ;

        for(int i=k-1 ; i>=0 ; i--) {
            left -= cardPoints[i] ;
            right += cardPoints[rightidx] ;
            rightidx-- ;

            maxsum = Math.max(maxsum , left+right) ;
        }
        return maxsum ;
        
    }
}