class Solution {
    public ArrayList<Integer> helper(ArrayList<ArrayList<Integer>> adj , int node , boolean[] vis) {
        vis[node] = true ;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(node);
        
        for(int nei : adj.get(node)) {
            if(!vis[nei]) {
                ArrayList<Integer> subans = helper(adj , nei , vis) ;
                ans.addAll(subans);
            }
        }
        return ans;
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
       
        boolean[] vis = new boolean[adj.size()] ;
         
         return helper(adj, 0, vis);
    }
}