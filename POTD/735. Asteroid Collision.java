class Solution {
    private int collide (int i, int j, ArrayList<Integer> aL) {
        int x = aL.get(i);
        int y = aL.get(j);
        if (x < 0 || y > 0) return -1;

        else if (Math.abs(x) > Math.abs(y)) {
            return j;
        }
        else if (Math.abs(y) > Math.abs(x)) return i;
        else return -2;

         
    }
    public int[] asteroidCollision(int[] asteroids) {
        int i = 0;
        int j = 1;
        int n = asteroids.length;
        ArrayList<Integer> aL = new ArrayList<>();
        for (int as : asteroids) aL.add(as);
        while (j < aL.size()) {
            int collideResult = collide(i, j, aL);
            if (collideResult == -1) {
                i++; j++;
            }
            else if (collideResult == j) {
                aL.remove(j);
            }
            else if (collideResult == i) {
                aL.remove(i);
                i--; j--;
            }
            else {
                aL.remove(i);
                aL.remove(i);
                i--; j--;
            }
            if (i < 0) {
                i = 0; j = 1;
            }

        }

        int[] ans = new int[aL.size()];
        for (int l = 0; l < ans.length; l++) ans[l] = aL.get(l);
        return ans;
    }
}