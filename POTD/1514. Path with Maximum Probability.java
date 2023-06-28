class Pair {
    int v;
    double wt;
    Pair (int _v, double _wt) {
        v = _v;
        wt = _wt;
    }
}

class pqPair {
    int u;
    int v;
    int wt;
    pqPair (int _u, int _v,  int _wt) {
        u = _u;
        v = _v;
        wt = _wt;
    }
}

class Solution {
    public ArrayList<ArrayList<Pair>> createGraph (int n, int[][] edges,  double[] succProb) {
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double weight = succProb[i];
            graph.get(u).add(new Pair(v, weight));
            graph.get(v).add(new Pair(u, weight));
        }
        return graph;
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        ArrayList<ArrayList<Pair>> graph = createGraph(n, edges, succProb);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.wt, a.wt));
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) weights[i] = 1e-9;

        weights[start] = 1;
        pq.offer(new Pair(start, 1.0));

        while (!pq.isEmpty()) {
            Pair curPair = pq.poll();
            int curNode = curPair.v;
            double curWt = curPair.wt;

            for (int i = 0; i < graph.get(curNode).size(); i++) {
                int adjNode = graph.get(curNode).get(i).v;
                double adjWt = graph.get(curNode).get(i).wt;

                if (curWt * adjWt > weights[adjNode]) {
                    weights[adjNode]  = (curWt * adjWt);
                    pq.offer(new Pair(adjNode, weights[adjNode]));
                }
            }
        } 

        return weights[end] == 1e-9 ? 0 : weights[end];

    }
}