public class Solution {
	// t - O( N )
	// S - O( k )
    public int[] dNums(int[] A, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++) {
            if(map.containsKey(A[i])) map.put(A[i], map.get(A[i]) + 1);
            else map.put(A[i], 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(map.size());
        
        for(int i = k; i < A.length; i++) {
            if(map.get(A[i - k]) == 1) map.remove(A[i - k]);
            else map.put(A[i - k], map.get(A[i - k]) - 1);
            if(map.containsKey(A[i])) map.put(A[i], map.get(A[i]) + 1);
            else map.put(A[i], 1);
            ans.add(map.size());
        }
        
        int[] a = new int[ans.size()];
        for(int i = 0; i < a.length; i++) a[i] = ans.get(i);

        return a;
    }
}
