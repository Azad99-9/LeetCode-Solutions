import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {

	public static int recur (int i , int n, ArrayList<Integer> A, int[] memoize) {
		if (i >= n) return 0;

		if (memoize[i] != -1) return memoize[i];

		int ls = A.get(i) + recur(i+2, n, A, memoize);
		int rs = recur(i+1, n, A, memoize);

		memoize[i] = Math.max(ls, rs);

		return memoize[i];
	}
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		int n = nums.size();

		// memoization
		// int[] memoize = new int[n];
		// Arrays.fill(memoize, -1);
		// return recur(0, n, nums, memoize);

		// tabullation
		// int[] table = new int[n];
		// table[0] = nums.get(0);
		// for (int i = 1; i < n; i++) {
		// 	int take = nums.get(i) + ((i - 2 >= 0) ? table[i-2] : 0);
		// 	int nottake = table[i-1];

		// 	table[i] = Math.max(take, nottake);
		// }
		// return table[n-1];

		// space optimization
		int[] table = new int[n];
		int pre1 = nums.get(0);
		int pre2 = 0;
		int cur = 0;
		for (int i = 1; i < n; i++) {
			
			int take = nums.get(i) + pre2;
			int nottake = pre1;

			cur = Math.max(take, nottake);
			pre2 = pre1;
			pre1 = cur;
		}
		return pre1;
		
	}
}