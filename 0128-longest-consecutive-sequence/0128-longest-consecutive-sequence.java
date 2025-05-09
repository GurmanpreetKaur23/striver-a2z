class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ;

        for(int num : nums) set.add(num) ;

        int longest = 0 ;

        for(int num : set) {
            if(!set.contains(num - 1)) {
                int curr = num ;
                int len = 1 ;

                while(set.contains(curr+1)) {
                    curr++;
                    len++;
                }
                longest = Math.max(longest , len) ;
            }
            
        }
        return longest ; 
    }
}