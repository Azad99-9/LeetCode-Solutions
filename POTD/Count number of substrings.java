
class Solution
{
    long atMostK(String s, int k) {
        int[] chars = new int[26];
        int left = 0;
        int ans = 0;
        int dist = 0;
        
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            if (chars[s.charAt(i) - 'a'] == 1) dist++;
            
            while (dist > k) {
                chars[s.charAt(left) - 'a']--;
                if (chars[s.charAt(left) - 'a'] == 0) dist--;
                left++;
            }
            
            ans += i - left + 1;
        }
        
        return ans;
    }
    long substrCount (String S, int k) {
        return atMostK(S, k) - atMostK(S, k-1);
    }
}