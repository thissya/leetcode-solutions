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
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(find(root.left),find(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Queue<TreeNode> que= new LinkedList<>();
        que.add(root);
        int ans=0;
        while(!que.isEmpty()){
            TreeNode cur=que.remove();
            ans=Math.max(ans,find(cur.left)+find(cur.right));
            if(cur.left!=null)que.add(cur.left);
            if(cur.right!=null)que.add(cur.right);
        }
        return ans;
    }
}
