class Solution {
    public String flipCoins(int N,String s) {
        int zeroes = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '0') zeroes++;
        }
        return (zeroes % 2 == 0) ? "Yes" : "No";
    }
}