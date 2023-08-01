
public class Solution {

	public static long countWaysToMakeChange(int denominations[], int value){
        long[] next = new long[value+1];
		long[] cur = new long[value+1];
		int n = denominations.length;
		
		next[value] = 1;

		for (int i=n-1; i > -1; i--) {
			for (int s = value; s > -1; s--){
				long pick = 0;
				if (s + denominations[i] <= value) pick = cur[s + denominations[i]];
				long notPick = next[s];
				cur[s] = pick + notPick;
			}
			next = cur;
			cur = new long[value+1];
		}

		return next[0];

	}
	
}