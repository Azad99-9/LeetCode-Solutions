class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();

        int l = 0;
        int r = 0;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int curVowels = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                curVowels++;
            }
        }

        r = k-1;
        int max = curVowels;

        while (r < n) {
            if (++r < n) {
                if (vowels.contains(s.charAt(l++))) curVowels--;
                if (vowels.contains(s.charAt(r))) curVowels++;
                max = Math.max(max, curVowels);
            }
        }

        return max;
    }
}