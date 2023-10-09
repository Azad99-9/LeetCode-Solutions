class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        List<Integer> cur = new ArrayList<>();
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) cur.add(1);
                else if (i == j) cur.add(1);
                else {
                    cur.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = cur;
            cur = new ArrayList<>();
        }

        return prev;
    }
}