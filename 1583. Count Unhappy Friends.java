class Solution {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        Map<Integer, Set<Integer>> mp = new HashMap<>();

        for (int[] pair: pairs) {
            for (int i = 0; i < 2; i++) {
                int x = pair[i];
                int y = pair[1 - i];
                Set<Integer> st = new HashSet<>();
                for (int j = 0; j < n - 1; j++) {
                    if (preferences[x][j] != y) {
                        st.add(preferences[x][j]);
                    } else {
                        break;
                    }
                }
                mp.put(x, st);
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Set<Integer>> cur: mp.entrySet()) {
            int x = cur.getKey();
            Set<Integer> frds = cur.getValue();
            for (Integer frd : frds) {
                if (mp.get(frd).contains(x)) {
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}