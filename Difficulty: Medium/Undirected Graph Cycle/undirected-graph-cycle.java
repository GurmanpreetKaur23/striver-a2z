import java.util.*;

class Solution {

    // DFS to detect cycle in an undirected graph
    public boolean isCycledfs(int u, List<List<Integer>> adj, boolean[] vis, int parent) {
        vis[u] = true;

        for (int v : adj.get(u)) {
            if (!vis[v]) {
                if (isCycledfs(v, adj, vis, u))
                    return true;
            } else if (v != parent) {
                return true;  // back-edge → cycle
            }
        }
        return false;
    }

    public boolean isCycle(int V, int[][] edges) {

        // Build adjacency list from edge list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];

            adj.get(u).add(v);
            adj.get(v).add(u);    // undirected graph
        }

        boolean[] vis = new boolean[V];

        // DFS on components
        for (int i = 0; i < V; i++) {
            if (!vis[i] && isCycledfs(i, adj, vis, -1))
                return true;
        }

        return false;
    }
}
