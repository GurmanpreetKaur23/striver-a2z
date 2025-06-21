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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>() ;
        List<List<Integer>> level = new ArrayList<>();

        q.offer(root) ;
        if(root == null) return level ;

        while(!q.isEmpty()) {
            int size = q.size() ;
            List<Integer> l = new ArrayList<>() ;
            for(int i=0; i<size ; i++) {
                TreeNode curr = q.poll() ;

                l.add(curr.val) ;
                if(curr.left != null) q.offer(curr.left) ;
                if(curr.right != null) q.offer(curr.right); 
            }
            level.add(l) ;
            
        }
        Collections.reverse(level) ;
        return level ;


    }
}