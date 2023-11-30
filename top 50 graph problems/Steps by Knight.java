class Solution
{
    int dx[] = {-2, -2, -1, -1, 1, 1, 2, 2};
    int dy[] = {-1, 1, -2, 2, -2, 2, -1, 1};

    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {
        int si = KnightPos[0] - 1;
        int sj = KnightPos[1] - 1;
        int di = TargetPos[0] - 1;
        int dj = TargetPos[1] - 1;

        boolean[][] vis = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{si, sj});
        vis[si][sj] = true;

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int ci = curr[0];
                int cj = curr[1];

                if (ci == di && cj == dj)
                    return steps;

                for (int k = 0; k < 8; k++) {
                    int ni = ci + dx[k];
                    int nj = cj + dy[k];

                    if (ni >= 0 && nj >= 0 && ni < N && nj < N && !vis[ni][nj]) {
                        vis[ni][nj] = true;
                        queue.offer(new int[]{ni, nj});
                    }
                }
            }
            steps++;
        }

        return -1; // Target position cannot be reached
    }
}
