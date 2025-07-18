class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length ; 
        int m = matrix[0].length ;

        int row = 0 ;
        int col = m-1  ;
        while(row<n && col>=0) {
            int ele = matrix[row][col] ;

            if(ele == target) return true ;
            else if(ele > target) col-- ;
            else row++ ;
        }
        return false;
    }
}