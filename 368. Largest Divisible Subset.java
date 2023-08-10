    // import java.util.*;

    class Solution {
        public List<Integer> largestDivisibleSubset(int[] arr) {
            Arrays.sort(arr);

            int n = arr.length;
            int l = 0; int r = n-1;
            while (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;r--;
            }

            // System.out.println(Arrays.toString(arr));
            
            // int[][] table = new int[n+2][n+1];

            // for (int i = n;  i > 0; i--) {
            //     for (int j = i-1; j > -1; j--)  {
            //         int take = 0;
            //         if (j == 0 || arr[j-1] % arr[i-1] == 0) {
            //             take = 1 + table[i+1][i];
            //         }
            //         int notTake = table[i+1][j];
            //         table[i][j] = Math.max(take, notTake);
            //     }
            // }

            // System.out.println(table[1][0]);

            // return new ArrayList<>();

            int[] freq = new int[n];
            int[] backTrack  = new  int[n];
            for (int i = 0; i  < n;  i++) backTrack[i]  = i;
            Arrays.fill(freq, 1);

            for (int i = 0;  i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] % arr[i] == 0 && freq[j]+1 > freq[i]) {
                        freq[i] = 1 + freq[j];
                        backTrack[i] = j;
                    }
                }
            }

            int  maxInd = 0;
            for (int i= 0;  i < n; i++) {
                if (freq[i] > freq[maxInd]) maxInd = i;
            }

            System.out.println(Arrays.toString(backTrack));

            ArrayList<Integer> ans = new ArrayList<>();
            int i = maxInd;
            while (backTrack[i] != i) {
                ans.add(arr[i]);
                i = backTrack[i];
            } 

            ans.add(arr[i]);

            return ans;
        }
    }