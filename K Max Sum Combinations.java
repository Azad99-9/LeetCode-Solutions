import java.util.* ;
import java.io.*;

// Time //The time complexity of the code is O(k log n), where n is the number of elements in the input lists A and B. This is because each time we get the maximum sum from the priority queue (implemented as a max-heap), it takes O(log n) time and we repeat this operation k times. The space complexity is O(n^2) because the maximum number of pairs that can be stored in the HashSet is n^2.

// Space // The space complexity of the code is O(n^2), where n is the number of elements in the input lists A and B. This is because the maximum number of pairs that can be stored in the HashSet is n^2, which can take up to O(n^2) space.

class Pair {
		int sum;
		List<Integer> p;
		Pair(int sum, List<Integer> p) {
			this.sum = sum;
			this.p = p;
		}
	}

public class Solution{
	
		public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> A, ArrayList<Integer> B, int n, int k){
		Collections.sort(A);
		Collections.sort(B);

		PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a,b) -> b.sum-a.sum);
		maxHeap.offer(new Pair(A.get(n-1)+B.get(n-1),Arrays.asList(n-1,n-1)));

		Set<List<Integer>> mySet = new HashSet<>();
		mySet.add(Arrays.asList(n-1,n-1));

		ArrayList<Integer> result = new ArrayList<>();

		while(k>0) {
			Pair top = maxHeap.poll();

			int sum = top.sum;
			int x = top.p.get(0);
			int y = top.p.get(1);

			result.add(sum);

			if(x-1 >= 0 && !mySet.contains(Arrays.asList(x-1,y))) {
				maxHeap.offer(new Pair(A.get(x-1)+B.get(y),Arrays.asList(x-1,y)));
				mySet.add(Arrays.asList(x-1,y));
			}

			if(y-1 >= 0 && !mySet.contains(Arrays.asList(x,y-1))) {
				maxHeap.offer(new Pair(A.get(x)+B.get(y-1), Arrays.asList(x,y-1)));
				mySet.add(Arrays.asList(x,y-1));
			}

			k--;
			}

		return result;


		


	}
}
