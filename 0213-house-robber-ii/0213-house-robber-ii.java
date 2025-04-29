class Solution {
    public int helper(int[] nums) {
        int n = nums.length; 
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i > 1) pick += prev2;
            int notPick = prev;

            int curr = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        // Exclude last house
        int[] nums1 = Arrays.copyOfRange(nums, 0, n - 1);

        // Exclude first house
        int[] nums2 = Arrays.copyOfRange(nums, 1, n);

        return Math.max(helper(nums1), helper(nums2));
    }
}
