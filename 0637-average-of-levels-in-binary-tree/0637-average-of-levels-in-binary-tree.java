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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>() ;
       
        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(root) ;
        if(root==null) return res ;
        while(!q.isEmpty()) {
            int levelsize = q.size() ;
        
            double avg = 0 ;
            for(int i=0 ; i<levelsize ; i++) {
                TreeNode curr = q.poll() ;
                avg += curr.val ;

                if(curr.left!=null) q.offer(curr.left) ;
                if(curr.right!=null) q.offer(curr.right) ;
            }
            avg = avg/levelsize ;
            res.add(avg) ;
        }
        return res ;
    
    }
}