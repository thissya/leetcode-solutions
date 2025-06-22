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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int res =1;
        while(!q.isEmpty()){
            int c= q.size();
            while(c>0){
                TreeNode p = q.poll();
                if(p.left==null && p.right==null)return res;
                if(p.left!=null)q.add(p.left);
                if(p.right!=null)q.add(p.right);
                c--;
            } 
            res++;
        }
        return res;
    }

}
