class Solution {
    public boolean isIsomorphic(String s, String t) {
        // step 1
        // je length nahi same ta pehla hi fasle krdo
        if(s.length() != t.length()) return false ;

        // step 2 
        // do maps bnaane hai 
        HashMap<Character , Character> maps = new HashMap<>() ;
        HashMap<Character , Character> mapt = new HashMap<>() ;

        // step 3
        // loop chlegi
        for(int i=0 ; i<s.length() ; i++) {
            char c1 = s.charAt(i) ;
            char c2 = t.charAt(i) ;

            // step 4
            // s-> t check krna hai pehla
            if(maps.containsKey(c1)) {
                if(maps.get(c1)!=c2) return false ;
            } 
             else maps.put(c1 , c2) ;

            // step 5
            // t-> s check krage
            if(mapt.containsKey(c2)) {
                if(mapt.get(c2)!=c1) return false;
               
            }
             else mapt.put(c2 , c1) ;
        }
        return true ;
    }
}