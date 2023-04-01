class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 1;
        while (i < str.length()) {
            if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
                str.deleteCharAt(i);
                i = i - 1;
                str.deleteCharAt(i);
            } else i++;
        }
        return str.toString();
    }
}
