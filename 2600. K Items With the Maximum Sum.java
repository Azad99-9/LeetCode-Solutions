class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans = 0;
        if(numOnes < k) {
             k-= numOnes;
             ans += numOnes;
        }
        else return k;
        if(numZeros < k) {
            k-=  numZeros;
        } else return ans;
        if (numNegOnes < k) {
            ans += (-1)*numNegOnes;
        } else ans += k * (-1);

        return ans;
    }
}