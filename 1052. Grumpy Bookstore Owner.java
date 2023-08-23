class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l = 0;
        int r = minutes - 1;
        int n = grumpy.length;
        int actualSatisfaction = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) actualSatisfaction += customers[i];
        }

        int curNotSatis = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) curNotSatis += customers[i];
        }

        int max = curNotSatis;
        while (++r < n) {
            int remove = 0;
            int add = 0;
            if (grumpy[l] == 1) remove = customers[l];
            if (grumpy[r] == 1) add = customers[r];
            curNotSatis-= remove;
            curNotSatis += add;
            l++;
            max = Math.max(max, curNotSatis);
        }

        return max + actualSatisfaction;
    }
}