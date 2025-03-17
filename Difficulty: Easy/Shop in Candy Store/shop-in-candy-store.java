//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int candies[]= new int[N];
            for(int i = 0; i < N; i++)
                candies[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> cost = ob.candyStore(candies,N,K);
            System.out.println(cost.get(0)+" "+cost.get(1));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int k){
        // code here
        ArrayList<Integer> ans = new ArrayList<>() ;
        Arrays.sort(candies);
        int min_amt = 0 , max_amt = 0 ;
        
        // min 
        int i = 0 , j = N-1 ;
        
        while(i<=j) {
            min_amt += candies[i] ;
            i++ ;
            j-=k ;
        }
        
        // max
        i = 0 ; j = N-1 ;
        
        while(i<=j) {
            max_amt += candies[j] ;
            j-- ;
            i+=k ;
        } 
        
        ans.add(min_amt);
        ans.add(max_amt) ;
        return ans; 
    }
}