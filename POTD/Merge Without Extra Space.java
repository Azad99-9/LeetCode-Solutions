class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // optimal 1
        int l = n-1;
        int r = 0;
        while (l >= 0 && r < m && arr1[l] > arr2[r]) {
            long tmp = arr1[l];
            arr1[l] = arr2[r];
            arr2[r] = tmp;
            l--; r++;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        
    }
}