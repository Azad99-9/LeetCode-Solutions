class Solution {
    private boolean goodString(String word, String chars, HashMap<Character, Integer> mp) {
        HashMap<Character, Integer> curMp = new HashMap<>(mp);

        for (int i = 0; i < word.length(); i++) {
            if (!curMp.containsKey(word.charAt(i))) return false;

            curMp.put(word.charAt(i), curMp.get(word.charAt(i)) - 1);

            if (curMp.get(word.charAt(i)) == 0) curMp.remove(word.charAt(i));
        }

        return true;
    }
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            int ct = 0;
            if (mp.containsKey(chars.charAt(i))) ct = mp.get(chars.charAt(i));
            mp.put(chars.charAt(i), ct + 1);
        }
        int ans = 0;
        for (String word: words) {
            if (goodString(word, chars, mp)) ans += word.length();
        }

        return ans;
    }
}
