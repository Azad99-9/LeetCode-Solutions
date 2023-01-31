//T- O(n)
//S- O(n)

class Solution {
    String ans = "";

    public void helper(int n, int k, List<Integer> ds, int fact) {
        if(n==1) {
            ans+= String.valueOf(ds.get(0));
            return;
        }
        fact = fact/n;
        int i= k/fact;
        n= n-1;
        k = k%fact;
        ans+= String.valueOf(ds.get(i));
        ds.remove(i);
        helper(n,k,ds,fact);
    }

    public String getPermutation(int n, int k) {
        List<Integer> ds = new LinkedList<>();
        int fact = 1;
        for(int i= 1; i<= n; i++) {
            ds.add(i);
            fact *= i;
        }

        helper(n, k-1, ds, fact);
        return ans;
    }
}
