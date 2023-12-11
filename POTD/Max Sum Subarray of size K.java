class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int i = 0;
        long cs = 0;
        for (int j = 0; j < K; j++) {
            cs += Arr.get(j);
        }
        long ans = cs;
        int j = K;
        while (j < N) {
            cs -= Arr.get(i);
            i++;
            cs += Arr.get(j);
            j++;
            ans = Math.max(cs, ans);
        }
        return ans;
    }
}
