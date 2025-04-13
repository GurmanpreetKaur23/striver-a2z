/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode root) {
        if(root==null) return 0 ;

        return 1 + Math.max(height(root.left) , height(root.right)) ;
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null) return true ;

        int diff = Math.abs(height(root.left) - height(root.right)) ;

        if(diff>1) return false ;

        return isBalanced(root.right) && isBalanced(root.left); 
    }
}