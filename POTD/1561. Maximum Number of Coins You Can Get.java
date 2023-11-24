class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int ans = 0;
        for (int i = 1; i <= piles.length / 3; i++) {
            System.out.println(n-(i*2));
            ans += piles[n-(i*2)];
        }
        return ans;
    }
}
