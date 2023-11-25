class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        for (int i = 0; i < n / 2; i++) {
            arr[i] = arr[i] + arr[i + n / 2] * 100000;
        }
        int j = n - 1;
        for (int i = n / 2 - 1; i >= 0; i--) {
            arr[j] = arr[i] / 100000;
            arr[j - 1] = arr[i] % 100000;
            j = j - 2;
        }
        
    }
}

