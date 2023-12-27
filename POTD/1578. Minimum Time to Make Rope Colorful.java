class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;

        int n = colors.length();

        int prev = neededTime[0];

        for (int i = 1; i < n; i++) {
            if (colors.charAt(i-1) == colors.charAt(i)) {
                int tmp = prev;
                prev = Math.max(prev, neededTime[i]);
                time += Math.min(tmp, neededTime[i]);
            } else {
                prev = neededTime[i];
            }
            System.out.println(time);
        }

        return time;
    }
}
