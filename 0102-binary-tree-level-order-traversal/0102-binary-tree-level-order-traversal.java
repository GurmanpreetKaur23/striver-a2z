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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>() ;
        Queue<TreeNode> q = new LinkedList<>() ;
        if(root==null) return res ;
        q.add(root) ;
        int curr = 0;

        while(!q.isEmpty()) {
            int len = q.size() ;
            res.add(new ArrayList<>());

            for(int i=0 ; i<len ; i++) {
                TreeNode node = q.poll() ;
                res.get(curr).add(node.val) ;

                if(node.left!=null) {
                    q.add(node.left) ;
                }

                if(node.right!=null) {
                    q.add(node.right) ;
                }
                
            } 
            curr++;
        }
        return res ;
    }
}