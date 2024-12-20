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
    public void levelOrder(TreeNode node1 , TreeNode node2 , int level) {
        if(node1==null || node2==null) return ;
        if(level%2 == 0) {
            int val = node1.val ;
            node1.val = node2.val ;
            node2.val = val ;
        }
        levelOrder(node1.left , node2.right , level+1) ;
        levelOrder(node1.right , node2.left , level+1) ;
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        levelOrder(root.left , root.right , 0 ) ;
        return root ;
    }
}