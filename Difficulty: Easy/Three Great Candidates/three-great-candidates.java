// User function Template for Java

class Solution {
    int maxProduct(int[] arr) {
        Arrays.sort(arr) ;
        int n = arr.length ;
        
        int max1 = arr[0] * arr[1] * arr[n-1] ;
        int max2 = arr[n-1] * arr[n-2] * arr[n-3] ;
        return Math.max(max1 , max2) ;
    }
}
