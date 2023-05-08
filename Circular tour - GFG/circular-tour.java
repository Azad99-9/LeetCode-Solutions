//{ Driver Code Starts
import java.util.*;


class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new Solution().tour(p,d));
		t--;
		}
	}
}
// } Driver Code Ends


// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
        int start = 0;
        int n = petrol.length;
 
        for (int i = 0; i < n; i++) {
            // Identify the first petrol pump from where we
            // might get a full circular tour
            if (petrol[i] >= distance[i]) {
                start = i;
                break;
            }
        }
 
        // To store the excess petrol
        int curr_petrol = 0;
        int i;
        for (i = start; i < n;) {
 
            curr_petrol
                += (petrol[i] - distance[i]);
 
            // If at any point remaining petrol is less than
            // 0, it means that we cannot start our journey
            // from current start
            if (curr_petrol < 0) {
                // We move to the next petrol pump
                i++;
 
                // We try to identify the next petrol pump
                // from where we might get a full circular
                // tour
                for (; i < n; i++) {
                    if (petrol[i] >= distance[i]) {
 
                        start = i;
 
                        // Reset rem_petrol
                        curr_petrol = 0;
 
                        break;
                    }
                }
            }
 
            else {
                // Move to the next petrolpump if
                // curr_petrol is
                // >= 0
                i++;
            }
        }
 
        // If remaining petrol is less than 0 while we reach
        // the first petrol pump, it means no circular tour
        // is possible
        if (curr_petrol < 0) {
            return -1;
        }
 
        for (int j = 0; j < start; j++) {
 
            curr_petrol
                += (petrol[j] - distance[j]);
 
            // If remaining petrol is less than 0 at any
            // point before we reach initial start, it means
            // no circular tour is possible
            if (curr_petrol < 0) {
                return -1;
            }
        }
 
        // If we have successfully reached intial_start, it
        // means can get a circular tour from final_start,
        // hence return it
        return start;
    }
}