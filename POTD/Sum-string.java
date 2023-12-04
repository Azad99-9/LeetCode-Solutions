class Solution{
    public String calSum(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i=s1.length()-1, j=s2.length()-1, sum=0, carry=0, rem=0;
        
        while(i>=0 || j>=0 || carry==1){
            sum = (i>=0?s1.charAt(i)-'0':0)+(j>=0?s2.charAt(j)-'0':0)+carry;
            rem = sum%10;
            i--; j--;
            carry = sum/10;
            sb.append(rem);
        }
        sb.reverse();
        return sb.toString();
    }
    public boolean rec(String s1,String s2,String S){
        if(S.isEmpty()) return true;
        String sum=calSum(s1,s2);
        if(S.startsWith(sum)) return rec(s2,sum,S.substring(sum.length()));
        return false;
    }
    public int isSumString(String S){
        // code here
        int n = S.length();
        for (int i=1;i<n-2;i++){
            for (int j=i+1;j<n-1;j++) {
                String s1=S.substring(0,i),s2=S.substring(i,j);
                if(rec(s1,s2,S.substring(j))) return 1;
            }
        }
        return 0;
    }
}
