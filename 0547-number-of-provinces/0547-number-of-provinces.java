class Solution {
    int n ;
    public void dfs(int[][] isConnected , boolean[] vis , int u) {
        vis[u] = true ;
        for(int i=0 ; i<n ; i++) {
            if(!vis[i] && isConnected[u][i]==1) {
                dfs(isConnected , vis , i) ;
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length ;

        boolean[] vis = new boolean[n] ;
        Arrays.fill(vis , false) ;
        int count = 0 ;

        for(int i=0 ; i<n ; i++) {
            if(!vis[i]) {
                count++ ;
                dfs(isConnected , vis , i) ;
            }
        }
        return count ;
    }
}