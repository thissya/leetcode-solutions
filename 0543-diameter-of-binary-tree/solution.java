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
    public static int recur(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(recur(root.left),recur(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = 0;
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            ans=Math.max(ans,recur(cur.left)+recur(cur.right));
            if(cur.left!=null)q.add(cur.left);
            if(cur.right!=null)q.add(cur.right);
        }
        return ans;
    }
}
