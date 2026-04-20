class Solution {
    Map<Integer, List<Integer>> adjList = new HashMap<>();
    
    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        int connected = 0;

        for (int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for (int[] adj : edges) {
            adjList.get(adj[0]).add(adj[1]);
            adjList.get(adj[1]).add(adj[0]);
        }

        for (int node = 0; node < n; node++) {
            if (!visited[node]) {
                dfs(node, visited);
                connected++;
            }
        }

        return connected;

    }

    private void dfs (int node, boolean[] visited) {
        if (visited[node]) {
            return;
        }

        visited[node] = true;

        for (int adj : adjList.get(node)) {
            if (!visited[adj]) {
                dfs(adj, visited);
            }
        }

        return;
    }
}
