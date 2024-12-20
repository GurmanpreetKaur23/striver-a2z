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
class Tuple {
    TreeNode node;
    int vertical;
    int level;
    
    Tuple(TreeNode node, int vertical, int level) {
        this.node = node;
        this.vertical = vertical;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, TreeMap<Integer, List<Integer>>> m = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();

        q.offer(new Tuple(root, 0, 0));

        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int vertical = tuple.vertical;
            int level = tuple.level;

            m.putIfAbsent(vertical, new TreeMap<>());
            m.get(vertical).putIfAbsent(level, new ArrayList<>());
            m.get(vertical).get(level).add(node.val);

            if (node.left != null) {
                q.add(new Tuple(node.left, vertical - 1, level + 1));
            }
            if (node.right != null) {
                q.add(new Tuple(node.right, vertical + 1, level + 1));
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (TreeMap<Integer, List<Integer>> levels : m.values()) {
            List<Integer> verticalOrder = new ArrayList<>();
            for (List<Integer> nodes : levels.values()) {
                Collections.sort(nodes);
                verticalOrder.addAll(nodes);
            }
            res.add(verticalOrder);
        }
        return res;
    }
}
