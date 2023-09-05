class Solution {
    public int reduce(char[] str) {

        int l = 0;
        int r = 0;
        int i = 0;
        int n = str.length;

        while (r < n) {
            if (str[r] != '#') {
                str[i] = str[r];
                i++;
            } else if (i > 0) i--;
            r++;
        }
        return i;
    }
    public boolean backspaceCompare(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int n1 = reduce(sarr);
        int n2 = reduce(tarr);

        int i = 0;
        int j = 0;

        System.out.println(n1 + " " + n2);

        if (n1 != n2) return false;

        while (i < n1 && j < n2) {
            if (sarr[i++] != tarr[j++]) return false;
        }
        return true;
    }
}