class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
		int[] next = new int[n+1];
		int[] cur = new int[n+1];

		for (int i = n; i > 0; i--) {
			for (int j = i; j > -1; j--) {
				int take = 0;
				if (j == 0 || arr[j-1] < arr[i-1]) take = 1 + next[i];
				int noTake = next[j];
				cur[j] = Math.max(take, noTake);
			}
			next = cur;
			cur = new int[n];
		}

		return next[0];
    }
    
}