class Solution {
    public int myAtoi(String s) {
        //T-O(N)
        //T-O(1)
        if(s.length()==0 || s == null)
                return 0;
				
        int index=0;
        char sign = '?';
        // In this for loop I am checking for '-' or '+' or digit or alphabet if alphabet return 0.
	
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(s.charAt(i)=='-'|| s.charAt(i)=='+'){
                    sign = s.charAt(i);// taking the sign for later use.
                    index = i+1;
                    break;
                }else if(Character.isDigit(s.charAt(i))){
                    index = i;
                    break;
                }else
                    return 0;
            }
        }
		
        //System.out.println(sign);
        long result=0;  // taking long to check the integer max value.
        // in this for loop I am calculating the result.
		
        for(int i=index;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                result = result*10+Character.getNumericValue(s.charAt(i));
                if(result > Integer.MAX_VALUE)
                    break;
            }else
                break;
        }
		
        //System.out.println(result);
		
        // here I am checking the range of result in which it lies then return.
		
        if(sign =='-' && result>Integer.MAX_VALUE)
            result = Integer.MIN_VALUE;
        else if(sign=='-' && result<=Integer.MAX_VAclass Solution {
    public int myAtoi(String s) {
        int i = 0;
        long ans = 0;
        int sign = 1;
        while(i< s.length() && s.charAt(i) == ' ')
            i++;
        if(i< s.length()) {
            if(s.charAt(i) == '-')
                sign = -1;
…        if(ans > 2147483647)
            return 2147483647;
        else if(ans < -2147483648)
            return -2147483648;
        return (int)ans;
    }
}LUE)
            result = result*-1;
        else if(result>Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;

        return (int)result;
        
    }
}

