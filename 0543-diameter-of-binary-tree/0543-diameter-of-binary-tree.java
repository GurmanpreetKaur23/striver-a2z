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
    private int diameter = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root) ;
        return diameter ;
    }
    public int depth(TreeNode root) {
        if(root==null) return 0 ;
        int left = depth(root.left);
        int right = depth(root.right) ;
        diameter = Math.max(diameter , left+right) ;
        return 1+Math.max(left , right) ;
    }
}