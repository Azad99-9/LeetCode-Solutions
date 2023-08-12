import java.util.*;

public class Solution {
    public static int findNumberOfLIS(int []arr) {
        int n = arr.length;
        int[] len = new int[n];
        int[] freq = new int[n];
        int max = 1;
        int ans = 0;
        Arrays.fill(len, 1);
        Arrays.fill(freq, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] ) {
                    if (len[j]+1 > len[i]) {
                        len[i] = len[j]+1;
                        max = Math.max(len[i], max);
                        freq[i] = freq[j];
                    } else if (len[j] + 1 == len[i]) {
                        freq[i] += freq[j];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (len[i] == max) {
                ans += freq[i];
            }
        }

        // max = n;
        // for (int ct: cnt) {
        //     max = Math.max(ct, max);
        // }

        // System.out.println(Arrays.toString(freq));
        // int ans = 0;
        // for (int i = 0; i < n; i++) {
        //     if (freq[i] == max) ans++;
        // }

        return ans;
    }
}