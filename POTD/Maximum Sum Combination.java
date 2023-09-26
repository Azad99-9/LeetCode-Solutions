//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Pair {
    int i;
    int j;
    Pair (int _i, int _j) {
        i = _i;
        j = _j;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Pair p = (Pair)o;
        return (i == p.i && j == p.j);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}

class PairSum {
    int i;
    int j;
    int sum;
    PairSum (int _i, int _j, int _sum) {
        i = _i;
        j = _j;
        sum = _sum;
    }
}

class Solution {
    static List<Integer> maxCombinations(int N, int k, int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = N - 1;
        int j = N - 1;
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<PairSum> pq = new PriorityQueue<>((a, b) -> b.sum - a.sum);
        HashSet<Pair> set = new HashSet<>();
        
        pq.offer(new PairSum(i, j, A[i] + B[j]));
        set.add(new Pair(i, j));
        
        for (int l = 0; l < k; l++) {
            PairSum max = pq.poll();
            
            ans.add(max.sum);
            
            i = max.i - 1;
            j = max.j;
            if (i >= 0 && j >= 0 && !set.contains(new Pair(i, j))) {
                pq.offer(new PairSum(i, j, A[i] + B[j]));
                set.add(new Pair(i, j));
            }
            
            i = max.i;
            j = max.j - 1;
            if (i >= 0 && j >= 0 && !set.contains(new Pair(i, j))) {
                pq.offer(new PairSum(i, j, A[i] + B[j]));
                set.add(new Pair(i, j));
            }
        }
        
        return ans;
    }
}
