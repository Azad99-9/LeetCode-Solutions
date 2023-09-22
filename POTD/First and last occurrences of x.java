import java.util.ArrayList;

class GFG {
    ArrayList<Integer> find(int arr[], int n, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Find the first occurrence of x
        int firstOccurrence = findFirstOccurrence(arr, n, x);
        
        // Find the last occurrence of x
        int lastOccurrence = findLastOccurrence(arr, n, x);
        
        // Add the results to the ArrayList
        result.add(firstOccurrence);
        result.add(lastOccurrence);
        
        return result;
    }
    
    // Function to find the first occurrence of x
    int findFirstOccurrence(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int firstOccurrence = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                firstOccurrence = mid;
                high = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return firstOccurrence;
    }
    
    // Function to find the last occurrence of x
    int findLastOccurrence(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int lastOccurrence = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                lastOccurrence = mid;
                low = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return lastOccurrence;
    }
}
