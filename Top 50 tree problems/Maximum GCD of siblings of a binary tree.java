class Solution {
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        Collections.sort(arr, (x, y) -> x.get(0) - y.get(0));
        
        int maxGcd = 0;
        
        for (int i = 1; i < arr.size(); i++) {
            ArrayList<Integer> curEdge = arr.get(i);
            ArrayList<Integer> prevEdge = arr.get(i-1);
            
            if (curEdge.get(0) == prevEdge.get(0)) {
                maxGcd = Math.max(gcd(curEdge.get(1), prevEdge.get(1)), maxGcd);
            }
        }
        
        return maxGcd;
    }
};
