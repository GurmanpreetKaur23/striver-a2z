class Solution {
    public int findLHS(int[] nums) {
        int count = 0 ;
        Map<Integer , Integer> freq = new HashMap<>() ;

        for(int num : nums) {
            freq.put(num , freq.getOrDefault(num , 0) + 1) ;
        }

        for(int num : freq.keySet()) {
            if(freq.containsKey(num + 1)) {
                int length = freq.get(num) + freq.get(num + 1);
                count = Math.max(count , length) ;
            }
        }
        return count ;
    }
}