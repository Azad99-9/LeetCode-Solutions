class Node {
    int wordCount = 0;
    Node[] chars = new Node[26];
    boolean endOfWord = false;

    Node () {

    }
}

class Trie {
    Node root;
    int noofStrings = 0;
    Trie () {
        this.root = new Node();
    }

    void insert(String str) {
        int level;
        int length = str.length();
        int index;

        Node presentChild = root;
        for (level = 0; level < length; level++) {
            index = str.charAt(level) - 'a';
            if (presentChild.chars[index] == null) presentChild.chars[index] = new Node();
            presentChild = presentChild.chars[index];
            presentChild.wordCount += 1;
        }
        presentChild.endOfWord = true;
        noofStrings += 1;
    }

    String lcp(int n) {
        Node presentChild = root;
        StringBuilder ans = new StringBuilder();
        while (!presentChild.endOfWord) {
            for (int i = 0; i < 26; i++) {
                if (presentChild.chars[i] != null) {
                    if (presentChild.chars[i].wordCount == n) { 
                        presentChild = presentChild.chars[i];
                        ans.append((char)('a' + i));
                        System.out.println(ans.toString());
                        break;
                    } else return ans.toString();
                }
            }
        }
        return ans.toString();
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        Trie helper = new Trie();
        for (int i = 0; i < strs.length; i++) {
            helper.insert(strs[i]);
        }
        return helper.lcp(strs.length);
    }
}
