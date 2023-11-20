class Solution {
    private int time(String[] g, int[] t, char cc) {
        int ct = 0;
        int mins = 0;
        boolean f = false;
        for (int i = 0; i < g.length; i++) {
            if (i > 0) ct += t[i-1];
            for (int j = 0; j < g[i].length(); j++) {
                if (g[i].charAt(j) == cc) {
                    mins += 1;
                    f = true;
                }
            }
            if (f) {
                mins += ct;
                f = false;
                ct = 0;
            }
        }

        return mins;
    }
    public int garbageCollection(String[] g, int[] t) {
        int n = g.length;

        return time(g, t, 'M') + time(g, t, 'P') + time(g, t, 'G');        
    }
}
