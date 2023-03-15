 /*
    
    Time Complexity : O(2^N)
    Space Complexity : O(N)

    Where N is the number of elements in the array.

    
*/

public class Solution {
    
    public static int helper(int arr[], int n, int k) {
        
        // Base condition.
        if (n <= 0) {
            // If k = 0, we reached target sum.
            if (k == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    
        // arr[n-1] not taken in considertion.   
        int x = helper(arr, n - 1, k);
        int y = 0;
        if(k - arr[n-1] >= 0){
            // arr[n-1] taken in considertion.
            y = helper(arr, n - 1, k - arr[n-1]);    
        }
    
        // Return current result.
        if(x == 1 || y == 1){
            return 1;
        }else{
            return 0;
        }
    }

    public static boolean subsetSumToK(int n, int k, int arr[]){
       
        // Calling recursive function.
        int ans = helper(arr, n, k);
        
        if (ans == 1) {
            return true;
        } else {
            return false;
        }
        
    }
}
 
