// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
        Map<Character , Integer> map = new HashMap<>() ;
        
        map.put('I' , 1) ;
        map.put('V' , 5) ;
        map.put('X' , 10) ;
        map.put('L' , 50) ;
        map.put('C' , 100) ;
        map.put('D' , 500) ;
        map.put('M' , 1000) ;
        int prev = 0;
        int res = 0;
        for(int i=s.length()-1 ; i>=0 ; i--) {
            int curr = map.get(s.charAt(i)) ;
            
            if(curr < prev) res -= curr ;
            else res += curr ;
            
            prev = curr;
        }
        return res ;
    }
}