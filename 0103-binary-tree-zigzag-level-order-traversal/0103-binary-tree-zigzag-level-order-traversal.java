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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>() ;
        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(root) ;
        if(root == null) return res ;
        boolean leftToRight = true ;
        while(!q.isEmpty()) {
            int size = q.size() ;
            List<Integer> level = new ArrayList<>() ;

            for(int i=0 ; i<size ; i++) {
                TreeNode temp = q.poll() ;
                if(leftToRight) level.add(temp.val) ;
                else level.add(0 , temp.val) ;

                if(temp.left!=null) q.offer(temp.left) ;
                if(temp.right!=null) q.offer(temp.right) ;

            }
            res.add(level) ;
            leftToRight = !leftToRight ;
        }
        return res;
    }
}