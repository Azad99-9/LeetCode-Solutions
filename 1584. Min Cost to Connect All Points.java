class Point {
    int x;
    int y;
    Point (int[] a) {
        x = a[0];
        y = a[1];
    }

    @Override
    public boolean equals(Object p2) {
        if (this == p2) return true;
        if (p2 == null || this.getClass() != p2.getClass()) return false;
        Point o = (Point)p2;
        return (o.x == x && o.y == y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}

class Ds {
    int[] parent;
    Ds (int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
    }

    int find(int u) {
        if (parent[u] < 0) return u;
        return find(parent[u]);
    }

    void union(int u, int v) {
        int upu = find(u);
        int upv = find(v);

        if (upu == upv) return;
        else if (parent[upu] < parent[upv]) {
            parent[upu] = parent[upu] + parent[upv];
            parent[upv] = upu;
        } else {
            parent[upv] = parent[upv] + parent[upu];
            parent[upu] = upv;
        }
    }
}

class Solution {
    private int dist (Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    public int minCostConnectPoints(int[][] points) {
        Map<Point, Integer> nodes = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            nodes.put(new Point(points[i]), i);
        }

        Ds ds = new Ds(points.length);
        int[] parent = ds.parent;

        ArrayList<int[]> edges = new ArrayList();

        for (int i = 0; i < points.length; i++) {
            Point p1 = new Point(points[i]);
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    Point p2 = new Point(points[j]);
                    edges.add(new int[]{nodes.get(p1), nodes.get(p2), dist(p1, p2)});
                }
            }
        }

        Collections.sort(edges, (a, b) -> a[2] - b[2]);

        int ans = 0;

        for (int i = 0; i < edges.size(); i++) {
            int[] edge = edges.get(i);
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            int upu = ds.find(u);
            int upv = ds.find(v);
            if (upu == upv) continue;
            ans += wt;
            ds.union(u, v);
            
        }

        return ans;
    }
}