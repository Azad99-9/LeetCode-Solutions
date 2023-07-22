class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Sort the citations in non-decreasing order
        int hIndex = 0;

        for (int i = citations.length - 1; i >= 0; i--) {
            int citationCount = citations[i];
            if (citationCount >= citations.length - i) {
                hIndex = citations.length - i;
            } else {
                break;
            }
        }

        return hIndex;
    }
}