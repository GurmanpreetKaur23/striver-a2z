class Solution {
    public void heapify(int[] nums , int n , int i) {
        int largest = i;
        int left = 2*i+1 ;
        int right = 2*i+2 ;

        if(left<n && nums[left]>nums[largest]) largest = left ;
        if(right<n && nums[right]>nums[largest]) largest = right ;

        if(largest!=i) {
            int temp = nums[i] ;
            nums[i] = nums[largest] ;
            nums[largest] = temp ;

            heapify(nums , n , largest) ;
        }
    } 
    public int findKthLargest(int[] nums, int k) {
       int n = nums.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Step 2: Extract max (root) k-1 times
        for (int i = n - 1; i >= n - k + 1; i--) {
            // Swap root with last
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Heapify reduced heap
            heapify(nums, i, 0);
        }

        // Step 3: Root is now the k-th largest
        return nums[0];
    }
}