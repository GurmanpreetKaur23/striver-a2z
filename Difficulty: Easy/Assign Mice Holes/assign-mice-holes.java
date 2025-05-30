//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S[] = read.readLine().split(" ");
            String st[] = read.readLine().split(" ");
            
            int[] M = new int[N];
            int[] H = new int[N];
            
            for(int i=0 ; i<N ; i++)
                M[i] = Integer.parseInt(S[i]);
                
            for(int i=0 ; i<N ; i++)
                H[i] = Integer.parseInt(st[i]);

            Solution ob = new Solution();
            System.out.println(ob.assignMiceHoles(N,M,H));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int assignMiceHoles(int N , int[] M , int[] H) {
        // code here
        Arrays.sort(M) ;
        Arrays.sort(H) ;
        
        int ans = Integer.MIN_VALUE ;
        
        for(int i=0 ; i<N ; i++) {
            ans = Math.max(ans , Math.abs(M[i] - H[i])) ;
        }
        
        return ans ;
    }
};