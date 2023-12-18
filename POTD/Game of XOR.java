class Solution {
    static int gameOfXor(int N , int[] A) {
        int sum=0;
      for(int i=0;i<N;i++){
          int val=(N-i)+(N-i)*i;
          if(val%2==1)
         sum=sum^A[i];
      }
        return sum;
    }
};
