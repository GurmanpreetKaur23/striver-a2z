class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0; 
        int max = 0;
        
        for(int i=0 ; i<k ; i++) sum += arr[i] ;
        
        max = sum ;
        
        for(int i=k ; i<arr.length ; i++) {
            sum += arr[i] ;
            // pichla kad do
            sum -= arr[i-k] ;
            max = Math.max(max , sum) ;
        }
        return max ;
    }
}