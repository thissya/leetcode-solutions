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
        List<Double> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> que =  new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            double sum =0;
            int n = que.size();
            for(int i=0;i<n;i++){
                TreeNode p = que.poll();
                sum+=p.val;
                if(p.left!=null){
                    que.offer(p.left);
                }
                if(p.right!=null){
                    que.offer(p.right);
                }
            }
            double cur =(double)sum/n;
            res.add(cur);
        }
        return res;
    }
}
