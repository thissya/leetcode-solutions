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
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        Stack<TreeNode> stk = new Stack<>();
        TreeNode prev=null;
        TreeNode cur = root;
        while(cur!=null || !stk.isEmpty()){
            while(cur!=null){
                stk.push(cur);
                cur=cur.left;
            }
            cur = stk.pop();
            if(prev==null){
                prev=cur;
            }
            else if(prev.val>=cur.val){
                return false;
            }
            prev=cur;
            cur=cur.right;
        }
        return true;
    }
}
