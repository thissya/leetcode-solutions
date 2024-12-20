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
    public TreeNode reverseOddLevels(TreeNode root) {
        tree(root.left,root.right,0);
        return root;
    }
    public void tree(TreeNode n1,TreeNode n2,int n){
        if(n1==null || n2==null){
            return;
        }
        if(n%2==0){
            int temp=n1.val;
            n1.val=n2.val;
            n2.val=temp;
        }
        tree(n1.left,n2.right,n+1);
        tree(n1.right,n2.left,n+1);

    }
}
