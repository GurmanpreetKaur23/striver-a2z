class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ls = new ArrayList<>() ;
        boolean vis[] = new boolean[adj.size()] ;
        vis[0] = true ;
        dfsOfGraph(0 , vis , ls , adj);
        return ls ;
        // Code here
        
    }
    public void dfsOfGraph(int node , boolean[] vis , ArrayList<Integer> ls ,ArrayList<ArrayList<Integer>> adj ) {
        vis[node] = true ;
        ls.add(node);
        
        for(int it : adj.get(node)) {
            if(vis[it]==false) {
                dfsOfGraph(it , vis , ls , adj) ;
            }
        }
    }
}