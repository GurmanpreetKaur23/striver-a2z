class Solution {

    private boolean check(TreeNode root , long min , long max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) return false;

        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
