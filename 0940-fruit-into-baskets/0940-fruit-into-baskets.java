class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length ;

        int maxlen = 0 , left = 0 ;
        HashMap<Integer , Integer> freq = new HashMap<>() ;

        for(int right = 0 ; right < fruits.length ; right++) {
            freq.put(fruits[right] , freq.getOrDefault(fruits[right],0)+1) ;

            while(freq.size()>2) {
                freq.put(fruits[left] , freq.getOrDefault(fruits[left],0)-1) ;

                if(freq.get(fruits[left])==0) {
                    freq.remove(fruits[left]) ;
                }
                left++ ;
            }
            maxlen = Math.max(maxlen , right-left+1) ;
        }
        return maxlen ;
    }
}