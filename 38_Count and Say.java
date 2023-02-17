class Solution {
    public String countAndSay(int n) {
    	//T-O(N^2)
    	//S-O(1)
        if(n == 1) return "1";
        String s = countAndSay(n - 1);
        StringBuilder res = new StringBuilder();

        int counter = 0;
        for(int i = 0; i < s.length(); i++) {
            counter++;
            if(i == s.length() - 1 || s.charAt(i) != s.charAt(i+1)) {
                res.append(counter).append(s.charAt(i));
                counter = 0;
            }
        }
        return res.toString();
    }
}
