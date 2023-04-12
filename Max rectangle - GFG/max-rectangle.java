//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
     public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        for(int i= 0; i<= n; i++) {
            while(!st.isEmpty() && (i==n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.pop()];
                int width;
                if(st.isEmpty()) width = i;
                else width = i- st.peek()-1;
                maxA = Math.max(maxA, width*height);
            }
            st.push(i);
        }
        return maxA;

    }

    public int maxArea(int M[][], int n, int m) {
        int curRow[] = M[0];
        int maxAns = largestRectangleArea(curRow);
        for (int i = 1; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 1) curRow[j] += 1;
                else curRow[j] = 0;
            }
            int curAns = largestRectangleArea(curRow);
            maxAns = Math.max(curAns, maxAns);
        }
        return maxAns;
    }
}