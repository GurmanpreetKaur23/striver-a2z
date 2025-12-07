class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;

        Queue<int[]> q = new LinkedList<>() ;

        int fresh = 0 ;

        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(grid[i][j] == 2) {
                    q.offer(new int[]{i , j}) ;
                }
                else if(grid[i][j] == 1) {
                    fresh++ ;
                }
            }
        }
        if(fresh == 0) return 0 ;

        int min = 0 ;
        int[][] dir = {{-1 , 0} , {1 , 0} , {0 , -1} , {0 , 1}} ;

        while(!q.isEmpty()) {
            int N = q.size() ;
            while(N-- > 0) {
                int curr[] = q.poll() ;
                int i = curr[0] ;
                int j = curr[1] ;


                for(int[] d : dir) {
                    int new_i = i + d[0] ;
                    int new_j = j + d[1] ;

                    if(new_i >= 0 && new_i < m && new_j >=0 && new_j <n && grid[new_i][new_j] == 1) {
                        grid[new_i][new_j] = 2 ;
                        fresh-- ;
                        q.offer(new int[]{new_i , new_j}) ;
                    }
                }
            }
            min++ ;
        }

        return (fresh==0) ? min-1 : -1 ;
    }
}