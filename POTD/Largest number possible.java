class Solution{
    static String findLargest(int N, int S){
        if (N == 0 && S == 0) return "";
        if (N != 1 && S == 0) return "-1";
        if (N == 0 && S != 0) return "-1";
        
        if (String.valueOf(S).length() > N) return "-1";
        
        StringBuilder str = new StringBuilder();
        
        int curSum = 0;
        
        for (int i = 0; i < N; i++) {
            if (curSum < S && S - curSum >= 9) {
                str.append("9");
                curSum += 9;
            } else if (curSum < S) {
                str.append(String.valueOf(S-curSum));
                curSum += S-curSum;
            } else {
                str.append("0");
            }
        }
        
        if (curSum != S) return "-1";
        // if (String.valueOf(Integer.valueOf(str.toString())).length() != str.length()) return "-1";
        // System.out.println(curSum);
        return str.toString();
    }    
}