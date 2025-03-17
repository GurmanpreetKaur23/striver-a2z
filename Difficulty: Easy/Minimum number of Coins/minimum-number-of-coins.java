//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java



class Solution {
    static List<Integer> minPartition(int N) {
        int[] currency = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < currency.length; i++) {
            while (N >= currency[i]) {
                ans.add(currency[i]);
                N -= currency[i];
            }
        }
        return ans;
    }
}
