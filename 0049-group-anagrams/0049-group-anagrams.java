class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>() ;

        Map<String , List<String>> map = new HashMap<>() ;

        for(String s : strs) {
            char[] c = s.toCharArray() ;

            Arrays.sort(c) ;

            String key = new String(c) ;

            map.computeIfAbsent( key , k -> new ArrayList<>()).add(s) ;
        }

        return new ArrayList<>(map.values());
    }
}