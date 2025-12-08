class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer> map = new HashMap<>() ;
        // boolean flag = false; 
        for(int i : arr) map.put(i , map.getOrDefault(i , 0) + 1) ;

        // for(int i : map.values()) {
        //     if(map.get(i) != map.get(i+1)) flag = true ;
        // }

        Set<Integer> set = new HashSet<>(map.values()) ;
        
        return set.size() == map.size();
    }
}