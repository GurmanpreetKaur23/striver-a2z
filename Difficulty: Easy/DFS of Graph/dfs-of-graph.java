class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Stack<Integer> st = new Stack<>() ;
        ArrayList<Integer> ans = new ArrayList<>() ;
        boolean[] vis = new boolean[adj.size()] ;
        int start = 0 ;
        // vis[start] = true ;
        st.push(start) ;
        while(!st.isEmpty()) {
            int node = st.pop() ;
            if(!vis[node]) {
                vis[node] = true ;
                ans.add(node) ;
            
            List<Integer> neighbors = adj.get(node) ;
            for(int i=neighbors.size()-1 ; i>=0 ; i--) {
                int nei = neighbors.get(i) ;
                if(!vis[nei]) {
                    st.push(nei) ;
                    // ans.add(nei) ;
                }
            }
            }
        }
        return ans;
    }
}