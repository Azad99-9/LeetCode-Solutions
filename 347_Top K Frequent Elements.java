import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

//T-O(N*logk)
//S-O(k)

class Pair {
	int element;
	int arrInd;
	int ind;

	Pair(int element, int arrInd, int ind) {
		this.element = element;
		this.arrInd = arrInd;
		this.ind = ind;
	}
}
public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		PriorityQueue<Pair> helper = new PriorityQueue<>((a,b) -> a.element-b.element);
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i= 0; i< k; i++)
			helper.offer(new Pair(kArrays.get(i).get(0), i, 0));
		while(!helper.isEmpty()) {
			Pair temp = helper.poll();
			ans.add(temp.element);
			if(kArrays.get(temp.arrInd).size() > temp.ind+1)
				helper.offer(new Pair(kArrays.get(temp.arrInd).get(temp.ind+1), temp.arrInd, temp.ind+1));
		}

		return ans;
	}
}

