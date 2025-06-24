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
    
    //dfs Approach  easy approach
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        boolean l=false;
        dfs(root,l);
        return sum;
    }
    public void dfs(TreeNode root,boolean l){
        if(root==null)return ;
        if(root.left==null && root.right==null && l){
            sum+=root.val;
            return;
        }

        dfs(root.left,true);
        dfs(root.right,false);
    }
    /*
    // BFS Approach
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(cur.left!=null && cur.left.left==null && cur.left.right==null){
                sum+=cur.left.val;
            }
            if(cur.left!=null)q.add(cur.left);
            if(cur.right!=null)q.add(cur.right);
        }
        return sum;
    }
    */
}
