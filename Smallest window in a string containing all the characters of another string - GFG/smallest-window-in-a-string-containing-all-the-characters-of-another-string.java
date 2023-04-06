//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p) {
    if (s == null || p == null || s.length() < p.length()) {
        return "-1";
    }

    int[] freq = new int[128]; // assuming ASCII character set
    int count = p.length();

    // count frequency of characters in pattern string p
    for (int i = 0; i < p.length(); i++) {
        freq[p.charAt(i)]++;
    }

    int left = 0, right = 0;
    int minLength = Integer.MAX_VALUE;
    int startIndex = -1;

    while (right < s.length()) {
        char c = s.charAt(right);
        if (freq[c] > 0) {
            count--;
        }
        freq[c]--;
        right++;

        while (count == 0) {
            if (right - left < minLength) {
                minLength = right - left;
                startIndex = left;
            }

            char d = s.charAt(left);
            freq[d]++;
            if (freq[d] > 0) {
                count++;
            }
            left++;
        }
    }

    return startIndex == -1 ? "-1" : s.substring(startIndex, startIndex + minLength);
}

}