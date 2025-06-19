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
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }   
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            
            TreeNode cur = q.poll();
            if(cur==null){
                continue;
            }
            int val = height(cur.left)-height(cur.right);
            if(val<-1 || val>1){
                return false;
            }
            q.add(cur.left);
            q.add(cur.right);
        }
        return true;
    }
}

/*
public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
*/
