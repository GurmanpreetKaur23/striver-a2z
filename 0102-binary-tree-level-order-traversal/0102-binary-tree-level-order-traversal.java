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

        if(root == null) return res ;
        q.offer(root) ;
        int curr = 0 ;
        while(!q.isEmpty()) {
           int len = q.size() ;
            res.add(new ArrayList<>());
            for(int i=0 ; i<len ; i++){
                 TreeNode temp = q.poll() ;
                res.get(curr).add(temp.val) ;

                if(temp.left != null) q.offer(temp.left) ;
            if(temp.right != null) q.offer(temp.right) ; 
            
            }
            
            curr++;
           
        }
        return res ;
    }
}