public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long sum = 0;
        long square_sum = 0;
        long val;
        
        for (long i = 0; i < A.size(); i++) {
            val = A.get((int)i);
            sum = sum + (i + 1) - val;
            square_sum = square_sum + (i + 1)* (i + 1) - val*val;
        }
        
        long yminusx = sum;
        long yplusx = square_sum / sum;
        
        long y = (yminusx + yplusx)/2;
        long x = y - sum;
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int)x);
        ans.add((int)y);
        return ans;
    }
}

