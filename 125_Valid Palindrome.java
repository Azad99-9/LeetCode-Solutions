class Solution {
    public boolean isAlphaNumeric(char x) {
        if ('A' <= x && x  <= 'Z' || 'a' <= x && x <= 'z' || '0' <= x && x <= '9') return true;
        return false;
    }

    public boolean isAlpha(char x) {
        if ('A' <= x && x <= 'Z' || 'a' <= x && x <= 'z') return true;
        return false;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            while (i <= j && !isAlphaNumeric(s.charAt(i))) i++;
            while (i <= j && !isAlphaNumeric(s.charAt(j))) j--;
            if (i <= j && isAlpha(s.charAt(i)) && isAlpha(s.charAt(j))) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            } else if (i <= j) if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
