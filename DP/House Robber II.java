import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		int n = nums.size();

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
	public static long houseRobber(int[] valueInHouse) {
		int n = valueInHouse.length;
		if (n == 1) return valueInHouse[0];
		ArrayList<Integer> t1 = new ArrayList<>();
		ArrayList<Integer> t2 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i != 0) t1.add(valueInHouse[i]);
			if (i != n-1) t2.add(valueInHouse[i]);
		}

		return Math.max(maximumNonAdjacentSum(t1), maximumNonAdjacentSum(t2));
	}	
}