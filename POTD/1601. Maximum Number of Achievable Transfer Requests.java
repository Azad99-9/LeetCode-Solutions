class Solution {
    public int maximumRequests(int n, int[][] req) {
        for (int k = req.length; k > 0; k--) {
            List<List<Integer>> combinations = generateCombinations(req.length, k);
            for (List<Integer> c : combinations) {
                int[] degree = new int[n];
                for (int i : c) {
                    degree[req[i][0]]--;
                    degree[req[i][1]]++;
                }
                if (allZeroes(degree)) {
                    return k;
                }
            }
        }
        return 0;
    }

    private List<List<Integer>> generateCombinations(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(combinations, new ArrayList<>(), 0, n, k);
        return combinations;
    }

    private void backtrack(List<List<Integer>> combinations, List<Integer> current, int start, int n, int k) {
        if (k == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < n; i++) {
            current.add(i);
            backtrack(combinations, current, i + 1, n, k - 1);
            current.remove(current.size() - 1);
        }
    }

    private boolean allZeroes(int[] arr) {
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}