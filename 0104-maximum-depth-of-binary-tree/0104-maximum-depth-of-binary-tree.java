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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0 ;
        Queue<TreeNode> q = new LinkedList<>() ;
        int height = 0 ;

        q.add(root) ;

        while(!q.isEmpty()) {
            int level = q.size() ;
            for(int i=0 ; i<level ; i++) {
                TreeNode node = q.poll() ;
                
                // node = q.poll() ;~
                if(node.left!=null) q.add(node.left) ;
                if(node.right!=null) q.add(node.right) ;
            }
            height++ ;
        }
        return height ;
    }
}