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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> stk = new Stack<>();

        stk.push(root);

        while(!stk.isEmpty()){
            TreeNode p = stk.pop();
            res.add(p.val);
            if(p.right!=null)stk.push(p.right);
            if(p.left!=null)stk.push(p.left);
        }
        return res;

    }
}
