class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {

        int mod = (int)1e9 + 7;
        ArrayList<Long> cur = new ArrayList<>();
        cur.add(1l);
        
        if (n == 1) return cur;
        
        ArrayList<Long> prev = cur;
        cur = new ArrayList<>();
        cur.add(1l);
        cur.add(1l);
        
        if (n == 2) return cur;
        
        for (int i = 3; i <= n; i++) {
            prev = cur;
            cur = new ArrayList<>();
            cur.add(1l);
            for (int j = 1; j < prev.size(); j++) {
                cur.add((prev.get(j-1) + prev.get(j)) % mod);
            }
            cur.add(1l);
        }
        
        return cur;
    }
}
