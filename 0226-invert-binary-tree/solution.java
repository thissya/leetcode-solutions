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
    public void swap(TreeNode root,TreeNode left,TreeNode right){
        if(left==null && right==null){
            return ;
        }
        
        root.left=right;
        root.right=left;
        if(root.left!=null)
            swap(root.left,right.left,right.right);
        if(root.right!=null)
            swap(root.right,left.left,left.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)){
            return root;
        }
        swap(root,root.left,root.right);
        return root;
    }
}
