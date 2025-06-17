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
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> cur = new ArrayList<>();
            int n = que.size();
            for(int i=0;i<n;i++){
                TreeNode p = que.poll();
                cur.add(p.val);
                if(p.left!=null){
                    que.offer(p.left);
                }
                if(p.right!=null){
                    que.offer(p.right);
                }
            }
            res.add(cur);
        }
        return res;
    }
}
