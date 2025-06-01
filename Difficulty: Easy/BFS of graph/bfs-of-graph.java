class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs = new ArrayList<>() ;
        boolean vis[] = new boolean[adj.size()] ;
        Queue<Integer> q = new LinkedList<>() ;
        q.add(0) ;
        vis[0] = true ;
        
        while(!q.isEmpty()) {
            int node = q.poll() ;
            bfs.add(node) ;
            
            for(int it : adj.get(node)) {
                if(vis[it] == false) {
                    vis[it] = true ;
                    q.add(it) ;
                }
            }
        }
        return bfs ;
    }
}