lass Solution {
    private long sumofNaturalNums(long len) {
        return (len * (len + 1) / (long)2);
    }
    public int countHomogenous(String s) {
        long count = 0;
        int len = 1;
        long mod = (long)1e9 + 7;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) len++;
            else {
                count = (count + sumofNaturalNums(len));
                len = 1;
            }
        }

        count = (count + sumofNaturalNums(len));
        System.out.println(count);
        return (int)(count % mod);        
    }
}
