class Solution {

    static int countPaths(int n, List<List<Integer>> roads) {
        double mod = 1e9 + 7;
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> road : roads) {
            graph.get(road.get(0)).add(new int[]{road.get(1), road.get(2)});
            graph.get(road.get(1)).add(new int[]{road.get(0), road.get(2)});
        }

        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);

        int[] path = new int[n];

        PriorityQueue<long[]> pq =
            new PriorityQueue<>((x, y)->{ return (int)x[0] - (int)y[0]; });

        pq.add(new long[]{0, 0});
        distance[0] = 0;
        path[0] = 1;

        while (!pq.isEmpty()) {
            long[] t = pq.poll();

            for (int[] nbr : graph.get((int)t[1])) {
                long vert = nbr[0];
                long edge = nbr[1];

                if (distance[(int)vert] > distance[(int)t[1]] + edge) {
                    distance[(int)vert] = distance[(int)t[1]] + edge;
                    pq.add(new long[]{distance[(int)vert], vert});
                    path[(int)vert] = path[(int)t[1]] % 1000000007;
                } else if (distance[(int)vert] == t[0] + edge) {
                    path[(int)vert] += path[(int)t[1]];
                    path[(int)vert] %= 1000000007;
                }
            }
        }

        return path[n - 1];
    }
}