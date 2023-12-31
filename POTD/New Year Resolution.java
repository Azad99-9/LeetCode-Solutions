class Solution {
    public static boolean isPossible(int N, int[] coins) {
        // code here
       return helper(0,coins,N,0);
    }
    public static boolean helper(int idx,int coins[],int n,int sum){
        if(sum!=0 && (sum%2024==0 ||sum%20==0||sum%24==0)){
            return true;
        }
        if(idx==coins.length){
            return false;
        }
        
        boolean temp1=helper(idx+1,coins,n,sum+coins[idx]);
        if(temp1==true)return true;
        
        boolean temp2=helper(idx+1,coins,n,sum);
        if(temp2==true)return true;
        
        return false;
    }
}
        

