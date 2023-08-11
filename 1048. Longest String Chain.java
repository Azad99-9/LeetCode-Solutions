class Solution {
    private boolean canInsert(String prev, String cur) {
        if (prev.length()+1 != cur.length()) return false;
        
        int count = 0;
        int i = 0; int j = 0;

        while (i < prev.length()) {
            if (prev.charAt(i) == cur.charAt(j)) {
                i++; j++;
            } else if (count == 0) {
                count++; j++;
            } else {
                return false;
            }
        }

        return true;
    }
    public int longestStrChain(String[] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        // System.out.println(Arrays.toString(arr));

        int[] freq = new int[n];
        Arrays.fill(freq, 1);
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (canInsert(arr[j], arr[i]) && freq[j]+1 > freq[i]) {
                    // System.out.println(true);
                    freq[i] = freq[j] + 1;
                }
            }
        }

        int max = 1;
        for (int i = 0; i < n; i++) {
            max = Math.max(freq[i], max);
        }

        return max;
    }
}