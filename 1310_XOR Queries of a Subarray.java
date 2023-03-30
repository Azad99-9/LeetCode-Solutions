class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xors = new int[arr.length];
        xors[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xors[i] = xors[i-1] ^ arr[i];
        }
        for (int it : xors) System.out.println(it);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            if (query[0] == query[1]) ans[i] = arr[query[0]];
            else if (query[0] == 0) ans[i] = 0 ^ xors[query[1]];
            else ans[i] = xors[query[0]-1] ^ xors[query[1]];
        }

        return ans;
    }
}
