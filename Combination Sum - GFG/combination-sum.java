//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        while(t-- >0)
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<>();
            str = br.readLine().trim().split(" ");
            for(int i = 0; i <n ;i++)
                list.add(Integer.parseInt(str[i]));
            str = br.readLine().trim().split(" ");    
            int sum = Integer.parseInt(str[0]);
            
            Solution ob = new Solution();
            
            res = ob.combinationSum(list, sum);
            if (res.size() == 0) {
    			out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) {
    			if (res.size() > 0) {
    				out.print("(");
    				List<Integer> ij = res.get(i);
    				for (int j = 0; j < ij.size(); j++) {
    				    
    					out.print(ij.get(j));
    					if(j < ij.size()-1)
    					 out.print(" ");
    				}
    				out.print(")");
    			}
    		}
    		out.println();
    		res.clear();
	    }
	    out.flush();
    }
    
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static void recursion(int i, int sum, int targetSum, ArrayList<Integer> subArray, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> A) {
    if (sum == targetSum) {
        ans.add(new ArrayList<>(subArray));
        return;
    }
    if (sum > targetSum || i == A.size()) {
        return;
    }
    // include the current element in the subArray
    subArray.add(A.get(i));
    recursion(i, sum+A.get(i), targetSum, new ArrayList<>(subArray), ans, A);
    // exclude the current element from the subArray
    subArray.remove(subArray.size()-1);
    // skip over any duplicates
    while (i+1 < A.size() && A.get(i) == A.get(i+1)) {
        i++;
    }
    recursion(i+1, sum, targetSum, new ArrayList<>(subArray), ans, A);
}


    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(A);
        int sum = 0;
        recursion(0, sum, B, new ArrayList<>(), ans, A);
        return new ArrayList<>(ans);
    }
}