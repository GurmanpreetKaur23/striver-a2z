class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        
        // Build the undirected graph
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        return dfs(source, destination, visited, adj);
    }

    private boolean dfs(int u, int dest, boolean[] visited, List<List<Integer>> adj) {
        if (u == dest) return true;
        visited[u] = true;
        for (int v : adj.get(u)) {
            if (!visited[v] && dfs(v, dest, visited, adj)) return true;
        }
        return false;
    }
}
