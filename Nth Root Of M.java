import java.util.* ;
import java.io.*; 
public class Solution {
	private static double multiply(double number, int n) {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * number;
        }
        return ans; 
    }

	public static double findNthRootOfM(int n, int m) {
		double low = 1;
        double high = m;
        double eps = 1e-7; 
        
        while((high - low) > eps) {
            double mid = (low + high) / 2.0; 
            if(multiply(mid, n) < m) {
                low = mid; 
            }
            else {
                high = mid; 
            }
        }
		return low;
	}
}

