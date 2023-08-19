
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        
        int max = -1;
        for (int i = n-1; i > -1; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                ans.add(0,max);
            }
        }
        return ans;
    }
}
