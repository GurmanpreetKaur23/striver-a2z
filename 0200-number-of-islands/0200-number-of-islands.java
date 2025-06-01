class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        int count = 0 ;

        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid , i , j) ;
                    count++ ;
                }
            }
        }
        return count ;
    }

    private void dfs(char[][] mat , int i , int j) {
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j] == '0') return;

        mat[i][j] = '0' ;

        dfs(mat , i+1 , j) ;
        dfs(mat , i-1 , j) ;
        dfs(mat , i , j+1) ;
        dfs(mat , i , j-1) ;
    }
}