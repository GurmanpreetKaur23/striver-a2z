class Solution {

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q = new LinkedList<>() ;
        boolean[] vis = new boolean[adj.size()] ;
        ArrayList<Integer> ans = new ArrayList<>() ;
        int start = 0 ;
        vis[start] = true ;
        q.add(start) ;
        
        while(!q.isEmpty()) {
            int node = q.poll() ;
            ans.add(node) ;
            
            for(int nei : adj.get(node)) {
                if(!vis[nei]) {
                    vis[nei] = true ;
                    q.add(nei) ;
                }
            }
        }
        return ans ;
    }
}