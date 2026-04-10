class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            return false;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        Map<Integer, Integer> parent = new HashMap<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(0);
        parent.put(0, -1);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nei : adj.get(node)) {
                if (nei == parent.get(node)) continue;

                if (parent.containsKey(nei)) return false;

                q.offer(nei);
                parent.put(nei, node);
            }
        }
        return parent.size() == n;
    }
}