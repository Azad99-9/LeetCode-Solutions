class Solution{
    
    static long countSubarrays(int a[], int n, int L, int R)  
    { 
         int z=0,prev=0;
        long ans=0,count=0;
        for(int i=0;i<n;i++){
            if(a[i]<L){
               if(count>0) count+=prev+1;
            }
            else if(a[i]>=L && a[i]<=R){
                prev=z;
                count+=z+1;
            }
            else{
                ans+=count;
                count=0;
                z=-1;
                prev=0;
            }
            z++;
        }
        ans+=count;
        return ans;
    } 
}

