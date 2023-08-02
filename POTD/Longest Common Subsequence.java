public class Solution {

	public static int lcs(String s, String t) {
		int[] next = new int[s.length()];
		int[] cur = new int[s.length()];

		int m = s.length();
		int n = t.length();
		for (int i = n-1; i > -1; i--) {
			for (int j = m-1; j > -1; j--) {
				
				if (s.charAt(j) == t.charAt(i)) {
					cur[j] = 1 + (j+1 < m ? next[j+1] : 0);
				} else {
					int right = j+1 < m ? cur[j+1] : 0;
					int down = next[j];
					cur[j] = Math.max(right, down);
				}
			}
			next = cur;
			cur = new int[m];
		}

		return next[0];
    }

} 