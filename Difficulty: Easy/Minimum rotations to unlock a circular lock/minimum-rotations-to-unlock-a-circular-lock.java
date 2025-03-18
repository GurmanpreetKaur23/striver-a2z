//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            long R = Long.parseLong(a[0]);
            long D = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.rotationCount(R, D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int rotationCount(long R, long D){
        // code here
        int ans = 0 ;
        long first , second ;
        
        while(R>0 || D>0) {
            first = R%10 ;
            second = D%10 ;
            R/=10 ;
            D/=10 ;
            
            ans += Math.min(Math.abs(first-second) , 10-Math.abs(first-second)) ;
        }
        return ans ;
    }
}