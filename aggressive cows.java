import java.util.* ;
import java.io.*; 
public class Solution {
    //T-O(NLOGN)
    //S-O(1)
    public static boolean isPossible(int mid, int c, int n, int[] positions) {
        int prePlayer = positions[0];
        int cnt = 1;
        for(int i= 1; i< positions.length; i++) {
            if(positions[i] - prePlayer >= mid) {
                cnt++;
                prePlayer = positions[i];
            }
            if(cnt == c)
                return true;
        }
        return false;
    }
    public static int chessTournament(int[] positions, int n,  int c) 
	{
        Arrays.sort(positions);
        int low = 1;
        int high = positions[n-1];
        int res = -1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(isPossible(mid,c,n,positions)) {
                res = mid;
                low = mid+1;
            } else
                high = mid-1;
        }
        return high;
    }

}
