class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length ;
        int[] candies = new int[n] ;
        

        // har bache nu ik candy dedo
        for(int i=0 ; i<n ; i++) {
            candies[i] = 1 ;
        }

        // left -> right 
        for(int i=1 ; i<n ; i++) {
            if(ratings[i] > ratings[i-1]) {
                candies[i] = candies[i-1] + 1 ;
            }
        }

        // right -> left
        for(int i=n-2 ; i>=0 ; i--) {
            if(ratings[i] > ratings[i+1]) {
                candies[i] = Math.max(candies[i] , candies[i+1]+1) ;
            }
        }

        int total = 0 ;
        for(int candy : candies) {
            total+=candy ;
        }
        return total ;
    }
}