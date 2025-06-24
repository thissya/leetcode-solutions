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
    private int res=0;
    public int pathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            checkSum(cur,(long)targetSum);
            if(cur.left!=null)q.add(cur.left);
            if(cur.right!=null)q.add(cur.right);
        }
        return res;
    }
    private void checkSum(TreeNode root,long targetSum){
        if(root==null){
            return ;
        }
        
        targetSum-=root.val;
        if(targetSum==0){
            res++;
        }
        checkSum(root.left,targetSum);
        checkSum(root.right,targetSum);
    }
}
