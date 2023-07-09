class Solution
{
    //Function to find the smallest positive number missing from the array.
    static void swap (int i, int j, int[] arr) {
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int missingNumber(int arr[], int size)
    {
        for (int i = 0; i < size; i++) {
            while (arr[i] > 0 && arr[i] <= size && arr[arr[i] - 1] != arr[i] && arr[i]-1 != i) {
                swap(i, arr[i] - 1, arr);
                // if (arr[i] - 1 == i) continue;
            }
            
        }
        for (int i = 0; i < size; i++) {
            if (arr[i]-1 != i) return i+1;
        }
        return size + 1;
    }
}