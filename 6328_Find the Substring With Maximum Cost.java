class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        Map<Character, Integer> charSet = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) charSet.put(chars.charAt(i), vals[i]);
        int[] valArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (charSet.containsKey(s.charAt(i))) valArray[i] = charSet.get(s.charAt(i));
            else valArray[i] = s.charAt(i) - 96;
        }
        
        int max = valArray[0], sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += valArray[i];
            if (sum < valArray[i]) sum = valArray[i];
            if (max < sum) max = sum;
        }
        
        if (max < 0) return 0;
        
        return max;
    }
}
