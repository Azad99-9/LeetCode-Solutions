
public class Solution {
    public long maxRunTime(int n, int[] b) {
        int m = b.length;
        Arrays.sort(b);
        long sum = 0;
        for (int num : b) {
            sum += num;
        }
        
        int i = m - 1;
        while (i >= 0 && sum / n < b[i]) {
            sum -= b[i];
            n--;
            i--;
        }
        
        return sum / n;
    }
}
