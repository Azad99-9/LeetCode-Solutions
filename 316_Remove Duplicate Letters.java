class Solution {
    public String removeDuplicateLetters(String s) {
        char[] hash = new char[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] += 1;
        }
        StringBuilder ans = new StringBuilder("");
        Stack<Character> helper = new Stack<>();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if (visited[s.charAt(i) - 'a']) {
                hash[s.charAt(i) - 'a']--;
                continue;
            }
            while (!helper.isEmpty() && helper.peek() > s.charAt(i) && hash[helper.peek() - 'a'] > 0)
                visited[helper.pop() - 'a'] = false;
            helper.push(s.charAt(i));
            visited[s.charAt(i) - 'a'] = true;
            hash[s.charAt(i) - 'a']--;
        }
        while (!helper.isEmpty()) {
            ans.append(new StringBuilder(String.valueOf(helper.pop())));
        }
        return ans.reverse().toString();

    }
}
