class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first_max = Integer.MIN_VALUE ;
        int second_max = Integer.MIN_VALUE;
        
        for(int num : arr) {
            if(num > first_max) {
                second_max = first_max ;
                first_max = num ;
            }
            
            else if(num > second_max && num != first_max) {
                second_max = num ;
            }
        }
        return (second_max == Integer.MIN_VALUE) ? -1 : second_max ;
    }
}