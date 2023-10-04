class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        Map<Character, Integer> priority = new HashMap<>();
        priority.put('I', 1);
        priority.put('V', 5);
        priority.put('X',10);
        priority.put('L', 50);
        priority.put('C', 100);
        priority.put('D', 500);
        priority.put('M', 1000);
        
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            int prev = 0;
            if (i - 1 >= 0) prev = priority.get(str.charAt(i-1));
            int cur = priority.get(str.charAt(i));
            
            if (prev == 0 || prev >= cur) ans += cur;
            else {
                ans -= prev;
                ans += (cur - prev);
            }
        }
        
        return ans;
    }
}