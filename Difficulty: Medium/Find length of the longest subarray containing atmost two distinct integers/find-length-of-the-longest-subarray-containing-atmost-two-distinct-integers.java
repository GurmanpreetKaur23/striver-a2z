//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            // Convert ArrayList to array
            Integer[] arr = new Integer[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call totalFruits method and print result
            Integer ans = ob.totalElements(arr);
            System.out.println(ans);

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int totalElements(Integer[] arr) {
        // code here
        int maxlen = 0 , left = 0 , n = arr.length ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int right = 0 ; right<n ; right++) {
            map.put(arr[right] , map.getOrDefault(arr[right] , 0) + 1) ;
            
            while(map.size() > 2) {
                map.put(arr[left] , map.get(arr[left])-1) ;
                
                if(map.get(arr[left])==0) {
                    map.remove(arr[left]) ;
                }
                left++ ;
            }
            maxlen = Math.max(maxlen , right-left+1) ;
        }
        return maxlen ;
        
        
    }
}