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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int newsum=targetSum-root.val;
        if(root.left==null && root.right==null){
            if(newsum==0){
                return true;
            }else{
                return false;
            }
        }
        return hasPathSum(root.left,newsum) || hasPathSum(root.right,newsum);
    }
}

/*
Approach 1:
public boolean hasPathSum(TreeNode root, int targetSum) {
        return recur(root,targetSum,0);    
    }

    private boolean recur(TreeNode root,int targetSum,int currentSum){
        if(root==null) return false;
        System.out.println(currentSum);
        if(root.left==null && root.right==null && root.val+currentSum == targetSum){
            return true;
        }
        return recur(root.left,targetSum,currentSum+root.val)||recur(root.right,targetSum,currentSum+root.val);
    }
*/
