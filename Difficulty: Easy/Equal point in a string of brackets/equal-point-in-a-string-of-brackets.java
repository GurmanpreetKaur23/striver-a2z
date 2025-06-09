class Solution {
    public int countSub(String str) {
        int n = str.length();
        int totalClose = 0;

        // Step 1: Count total closing brackets
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ')') totalClose++;
        }

        int open = 0;

        // Step 2: Traverse and find the equal point
        for (int i = 0; i <= n; i++) {
            if (open == totalClose) return i;

            if (i < n) {
                if (str.charAt(i) == '(') open++;
                else totalClose--; // it's ')'
            }
        }

        return -1; // No equal point found
    }
}
