class Solution {
    public String longestCommonPrefix(String[] strs) {
    //T-O(N*m) n - noofstrings m-longest string in strs
    //S-O(1)
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i= 1; i< strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
