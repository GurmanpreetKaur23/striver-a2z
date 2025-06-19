class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 ;
        int high = getmax(piles) ;
        int res = high ;

        while(low <= high) {
            int mid = (low) + (high - low) / 2 ;

            if(caneat(piles , h , mid)) {
                res = mid ;
                high = mid - 1 ;
            }
            else low = mid + 1 ;
        }
        return res ;
    }
    public int getmax(int[] piles){
        int maxxx = 0 ;
        for(int pile : piles) maxxx = Math.max(pile , maxxx) ;
        return maxxx ;
    }

    public boolean caneat(int[] piles , int h , int k) {
        long total = 0;
        for(int pile : piles){ 
            total += (pile + k - 1L) / k ;
        }
        return total <= h ;
    }
}