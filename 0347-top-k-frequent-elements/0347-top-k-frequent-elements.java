class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>() ;

        int[] res = new int[k] ;

        for(int num : nums) {
            freq.put(num , freq.getOrDefault( num , 0) + 1) ;
        }

        // min-heap
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            ( a , b) -> freq.get(a) - freq.get(b) 
        ) ;

        for(int num : freq.keySet()) {
            heap.offer(num) ;
            if(heap.size() > k) heap.poll() ;
        }

        for(int i=0 ; i<k ; i++) {
            res[i] = heap.poll() ;
        }
        return res ;
    }
}