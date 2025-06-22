/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
        if (root == null || (root.left == null && root.right == null))
            return res;
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int c = q.size();
            while (c > 0) {
                c--;
                TreeNode cur = q.poll();

                if (cur.left != null) {
                    map.put(cur.left, cur); // mapping the child node with the parent node
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    map.put(cur.right, cur); //  mapping the child node with the parent node
                    q.add(cur.right);
                }
            }
        }
        q.clear();
        q.add(target);
        int k1 = 0;
        Set<TreeNode> set = new HashSet<>();
        set.add(target);
        while (!q.isEmpty()) {
            if (k == k1) {
                break;
            }
            int c = q.size();
            while (c > 0) {
                TreeNode cur = q.poll();

                if (cur.left != null && !set.contains(cur.left)) {
                    q.add(cur.left);
                    set.add(cur.left);
                }
                if (cur.right != null && !set.contains(cur.right)) {
                    q.add(cur.right);
                    set.add(cur.right);
                }
                TreeNode par = map.get(cur);
                if (par != null && !set.contains(par)) {
                    q.add(par);
                    set.add(par);
                }
                c--;
            }
            k1++;
        }
        while (!q.isEmpty()) {
            res.add(q.poll().val);
        }
        return res;
    }
}
