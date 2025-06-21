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
    public int check(TreeNode node , int maxval) { 
        if(node == null) return 0;

        int res = (node.val >= maxval) ? 1 :0 ;
        maxval = Math.max(maxval , node.val) ;

        res += check(node.left , maxval) ;
        res += check(node.right , maxval) ;

        return res ;
    }
    public int goodNodes(TreeNode root) {
        return check(root , root.val) ;
    }
}