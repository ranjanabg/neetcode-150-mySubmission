class Solution {
    Map<Integer, List<Integer>> adj = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    public boolean validTree(int n, int[][] edges) {

        if (edges.length != n - 1) return false;

        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        if (hasCycle(0, -1)) {
            return false;
        }

        return visited.size() == n;
    }

    private boolean hasCycle(int a, int parent) {
        if (visited.contains(a)) {
            return true;
        }

        visited.add(a);
        for (int nei : adj.get(a)) {
            if (nei == parent) {
                continue;
            }

            if(hasCycle(nei, a)) {
                return true;
            }
        }

        return false;
    }
}
